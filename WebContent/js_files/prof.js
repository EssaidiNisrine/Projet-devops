// function searchFunction() {

//     let input, filter, table, tr, td, txtValue;

//     input = document.getElementById("search");
//     filter = input.value.toUpperCase();
//     table = document.getElementById("myTable")
//     tr = table.getElementsByTagName("tr");

//     for (let i = 0; i < tr.length; i++) {
//         td = tr[i].getElementsByTagName("td")[0];
//         if (td) {
//             txtValue = td.textContent || td.innerText;
//             if (txtValue.toUpperCase().indexOf(filter) > -1) {
//                 tr[i].style.display = "";
//             }
//             else {
//                 tr[i].style.display = "none";
//             }
//         }
//     }
// }

let searchMood = 'nom';

function getSearchMode(id) {
    let search = document.getElementById("search");
    if (id == "searchByName") {
        searchMood = 'nom';
        search.placeholder = 'rechercher par nom';
    }
    else {
        searchMood = 'element';
        search.placeholder = 'rechercher par element du prof';
    }
    search.focus()
    console.log(searchMood);
}

function searchFunction() {
    if (searchMood == 'nom') {
        let input, filter, table, tr, td, txtValue;

        input = document.getElementById("search");
        filter = input.value.toUpperCase();
        table = document.getElementById("myTable")
        tr = table.getElementsByTagName("tr");

        for (let i = 0; i < tr.length; i++) {
            td = tr[i].getElementsByTagName("td")[0];
            if (td) {
                txtValue = td.textContent || td.innerText;
                if (txtValue.toUpperCase().indexOf(filter) > -1) {
                    tr[i].style.display = "";
                }
                else {
                    tr[i].style.display = "none";
                }
            }
        }
    }
    else {
        let input, filter, table, tr, td, txtValue;

        input = document.getElementById("input");
        filter = input.value.toUpperCase();
        table = document.getElementById("myTable")
        tr = table.getElementsByTagName("tr");

        for (let i = 0; i < tr.length; i++) {
            td = tr[i].getElementsByTagName("td")[3];
            if (td) {
                txtValue = td.textContent || td.innerText;
                if (txtValue.toUpperCase().indexOf(filter) > -1) {
                    tr[i].style.display = "";
                }
                else {
                    tr[i].style.display = "none";
                }
            }
        }
    }
}





















