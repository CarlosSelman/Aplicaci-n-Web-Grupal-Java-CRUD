$("#menu-toggle").click(function(e) {
	e.preventDefault();
	$("#wrapper").toggleClass("toggled");
});
$(document).ready(function() {
	$('#team').DataTable();
});

function erase(){
    alert('Elemento borrado con exito !!');
}
