function edit_row(no) {
    document.getElementById("edit_button" + no).style.display = "none";
    document.getElementById("save_button" + no).style.display = "block";

    var name = document.getElementById("name_row" + no);
    var password = document.getElementById("password_row" + no);

    var name_data = name.innerHTML;
    var password_data = password.innerHTML;

    name.innerHTML = "<input type='text' id='name_text" + no + "' value='" + name_data + "'>";
    password.innerHTML = "<input type='text' id='password_text" + no + "' value='" + password_data + "'>";
}

function save_row(no) {
    var name_val = document.getElementById("name_text" + no).value;
    var password_val = document.getElementById("password_text" + no).value;

    document.getElementById("name_row" + no).innerHTML = name_val;
    document.getElementById("password_row" + no).innerHTML = password_val;

    document.getElementById("edit_button" + no).style.display = "block";
    document.getElementById("save_button" + no).style.display = "none";
}

function delete_row(no) {
    document.getElementById("row" + no + "").outerHTML = "";
}

function add_row() {
    var new_name = document.getElementById("new_name").value;
    var new_password = document.getElementById("new_password").value;

    var table = document.getElementById("myTable");
    var table_len = (table.rows.length) - 1;
    var row = table.insertRow(table_len).outerHTML = "<tr id='r0ow" + table_len + "'><td id='name_row" + table_len + "'>" + new_name + "</td><td id='password_row" + table_len + "'>" + new_password + "</td><td><input type='button' id='edit_button" + table_len + "' value='modifier' class='edit btn btn-secondary' onclick='edit_row(" + table_len + ")'> <input type='button' id='save_button" + table_len + "' value='sauvegarder' class='save btn btn-primary' onclick='save_row(" + table_len + ")'> <input type='button' value='supprimer' class='delete btn btn-danger' onclick='delete_row(" + table_len + ")'></td></tr>";

    document.getElementById("new_name").value = "";
    document.getElementById("new_password").value = "";

}