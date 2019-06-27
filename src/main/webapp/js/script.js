var param1Units = document.getElementsByName("param1Units")[0];
var param2Units = document.getElementsByName("param2Units")[0];

//Добавляем слушатель к radioButton
var arguments = document.getElementsByName("arg");
    for (var i = 0; i < arguments.length; i++) {
        arguments[i].addEventListener("change",changeUnits);
    }

var param1Input = document.getElementsByName("param1")[0];
var param2Input = document.getElementsByName("param2")[0];

function changeUnits(){
    var inp = document.getElementsByName("arg");
    for (var i = 0; i < inp.length; i++) {
        if (inp[i].type == "radio" && inp[i].checked) {
            if (inp[i].value=="PH"){
                param1Input.placeholder = "Давление";
                param1Units.innerHTML = "<option value=\"PRESSURE_KGS_SM2_gauge\">кгс/см2(изб)</option>" +
                                "<option value=\"PRESSURE_KGS_SM2_abs\">кгс/см2(абс)</option>" +
                                "<option value=\"PRESSURE_MPA_abs\">МПа(изб)</option>" +
                                "<option value=\"PRESSURE_MPA_gauge\">МПа(абс)</option>";
                param2Input.placeholder = "Энтальпия";
                param2Units.innerHTML = "<option value=\"kcal/kg\">ккал/кг</option>" +
                                        "<option value=\"kJ/kg\">кДж/кг</option>";
            } else if (inp[i].value=="HS"){
                param1Input.placeholder = "Энтальпия";
                param1Units.innerHTML = "<option value=\"ENTALPHY_KKAL_KG\">ккал/кг</option>" +
                                        "<option value=\"ENTALPHY_KJ_KG\">кДж/кг</option>";
                param2Input.placeholder = "Энтропия";
                param2Units.innerHTML = "<option value=\"ENTROPY_KKAL_KG_C\">ккал/кг·°C</option>" +
                                        "<option value=\"ENTROPY_KJ_KG_C\">кДж/кг·°C</option>";
            } else if (inp[i].value=="PT"){
                param1Input.placeholder = "Давление";
                param1Units.innerHTML = "<option value=\"PRESSURE_KGS_SM2_gauge\">кгс/см2(изб)</option>" +
                                        "<option value=\"PRESSURE_KGS_SM2_abs\">кгс/см2(абс)</option>" +
                                        "<option value=\"PRESSURE_MPA_abs\">МПа(изб)</option>" +
                                        "<option value=\"PRESSURE_MPA_gauge\">МПа(абс)</option>";
                param2Input.placeholder = "Температура";
                param2Units.innerHTML = "<option value=\"TEMPERATURE_K\">K</option>" +
                                        "<option value=\"TEMPERATURE_C\">°C</option>";
            } else if (inp[i].value=="P"){
                param1Input.placeholder = "Давление";
                param1Units.innerHTML = "<option value=\"PRESSURE_KGS_SM2_gauge\">кгс/см2(изб)</option>" +
                                        "<option value=\"PRESSURE_KGS_SM2_abs\">кгс/см2(абс)</option>" +
                                        "<option value=\"PRESSURE_MPA_abs\">МПа(изб)</option>" +
                                        "<option value=\"PRESSURE_MPA_gauge\">МПа(абс)</option>";
            } else if (inp[i].value=="T"){
                param1Input.placeholder = "Температура";
                param1Units.innerHTML = "<option value=\"TEMPERATURE_K\">K</option>" +
                                        "<option value=\"TEMPERATURE_C\">°C</option>";
            }
        }
    }

}