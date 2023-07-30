let contentMenu = null;
let btnAtras = null;
let btnSiguiente = null;
let waitContent = null;
let numPagina = 0;
window.onload = function(){
	contentMenu = document.getElementById("contentMenu");
	btnAtras = document.getElementById("btnAtras");
	btnSiguiente = document.getElementById("btnSiguiente");
	waitContent = document.getElementById("waitContent");

	getPokemons("https://pokeapi.co/api/v2/pokemon");
}

function getPokemons(endpoint){
	waitContent.style.display = 'block';
	fetch( endpoint )
	.then( res => res.json() )
	.then( data => {
		contentMenu.innerHTML = "";
		for (var i=0; i<data.results.length; i++) {
			let btnTemp = `<button class="col-2 m-1 btn btn-outline-primary">${ data.results[i].name }</button>`;
			contentMenu.innerHTML += btnTemp;
		}

		btnTemp = document.querySelectorAll("#contentMenu button");
		btnTemp.forEach(button => {
			button.addEventListener("click", () => {
				let btnTexto = button.textContent;

				
				for (let i = 0; i < data.results.length; i++) {
					if (btnTexto == data.results[i].name) {
						colocarImg(data.results[i].url); 
						break;
					}
				}
			});
		});

		btnAtras.setAttribute("data-endpoint", data.previous );
		btnSiguiente.setAttribute("data-endpoint", data.next);
		waitContent.style.display = 'none';
	});
	numeroPagina.innerHTML = "";
	let numero = `<label>pag: ${numPagina}</label>`;
	numeroPagina.innerHTML += numero;
}

function colocarImg(endpoint) {
	waitContent.style.display = 'none';
	fetch( endpoint ).then( resultado => resultado.json() ).then( data => {
		nombrePkemon.innerHTML = "";
		let nombre = `<h5 class="text-center mb-3">${data.forms[0].name}</h5>`;
		nombrePkemon.innerHTML += nombre;

		let endpointforms = data.forms[0].url;
		fetch( endpointforms ).then( resultado => resultado.json() ).then( data1 => {
			imgPokemon.innerHTML = "";
			let img = `<img height="230" src="${ data1.sprites.front_default }" alt=""></img>`;
			imgPokemon.innerHTML += img;
		});	
	});

}

function getNext(){
	let endpoint = btnSiguiente.getAttribute("data-endpoint");
	if (endpoint!=null){
		numPagina++;
		getPokemons(endpoint);
	}else{
		waitContent.style.display = 'none';
	}
}

function getBack(){
	let endpoint = btnAtras.getAttribute("data-endpoint");
	if (endpoint!=null && numPagina>=0){
		numPagina--;
		getPokemons(endpoint);
	}else{
		waitContent.style.display = 'none';
	}
}
