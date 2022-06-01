/**
 * 
 */
function numbers(input){
	document.getElementById("play").value += input;
}

function symbols(input){
	document.getElementById("play").value = input;
}

function clear(input){
	document.getElementById("play").value = input;
}

function evaluate() {
	try{
		symbols(eval(document.getElementById("play").value))
	}
	catch{
		symbols('error')
	}
}