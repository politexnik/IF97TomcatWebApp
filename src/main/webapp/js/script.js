var param1Units = document.getElementsByName("param1Units")[0];
var param2Units = document.getElementsByName("param2Units")[0];

//Добавляем слушатель к radioButton
var arguments = document.getElementsByName("agr");
    for (var i = 0; i < arguments.length; i++) {
        arguments[i].addEventListener("change",changeUnits);
    }

var param1Input = document.getElementsByName("param1")[0];
var param2Input = document.getElementsByName("param2")[0];

function changeUnits(){
    var inp = document.getElementsByName("agr");
    for (var i = 0; i < inp.length; i++) {
        if (inp[i].type == "radio" && inp[i].checked) {
            if (inp[i].value=="PH"){
                param1Input.placeholder = "Давление";
                param1Units.innerHTML = "<option value=\"kgs/sm2I\">кгс/см2(изб)</option>" +
                                "<option value=\"kgs/sm2A\">кгс/см2(абс)</option>" +
                                "<option value=\"MPaI\">МПа(изб)</option>" +
                                "<option value=\"MPaA\">МПа(абс)</option>";
                param2Input.placeholder = "Энтальпия";
                param2Units.innerHTML = "<option value=\"kcal/kg\">ккал/кг</option>" +
                                        "<option value=\"kJ/kg\">кДж/кг</option>";
            } else if (inp[i].value=="HS"){
                param1Input.placeholder = "Энтальпия";
                param1Units.innerHTML = "<option value=\"kcal/kg\">ккал/кг</option>" +
                                        "<option value=\"kJ/kg\">кДж/кг</option>";
                param2Input.placeholder = "Энтропия";
                param2Units.innerHTML = "<option value=\"kcal/kg*K\">ккал/кг·°C</option>" +
                                        "<option value=\"kJ/kg*K\">кДж/кг·°C</option>";
            } else if (inp[i].value=="PT"){
                param1Input.placeholder = "Давление";
                param1Units.innerHTML = "<option value=\"kgs/sm2I\">кгс/см2(изб)</option>" +
                                        "<option value=\"kgs/sm2A\">кгс/см2(абс)</option>" +
                                        "<option value=\"MPaI\">МПа(изб)</option>" +
                                        "<option value=\"MPaA\">МПа(абс)</option>";
                param2Input.placeholder = "Температура";
                param2Units.innerHTML = "<option value=\"K\">K</option>" +
                                        "<option value=\"C\">°C</option>";
            } else if (inp[i].value=="P"){
                param1Input.placeholder = "Давление";
                param1Units.innerHTML = "<option value=\"kgs/sm2I\">кгс/см2(изб)</option>" +
                                        "<option value=\"kgs/sm2A\">кгс/см2(абс)</option>" +
                                        "<option value=\"MPaI\">МПа(изб)</option>" +
                                        "<option value=\"MPaA\">МПа(абс)</option>";
            } else if (inp[i].value=="T"){
                param1Input.placeholder = "Температура";
                param1Units.innerHTML = "<option value=\"K\">K</option>" +
                                        "<option value=\"C\">°C</option>";
            }
        }
    }

}