<@xy.html>
<@xy.html_head value="单表动态行[kf_dbdth]管理">
</@xy.html_head>
<@xy.html_body>
<@xy.nav/>
<@xy.container>
<@xy.page_content>
<@xy.content_title value="单表动态行[kf_dbdth]">
    <@xy.button type="add" text="增加" onclick="addKf_dbdth()"/>
    <@xy.button url="${ctx}/base/kfpt/kfyl/dbdth/saveKf_dbdth" type="save" onclick="submitx(this,'formx')"/>
</@xy.content_title>
<@xy.content_body>
<@xy.form id="formx" position="search">
    <div class="grid-edit">
    <div class="thead">
    <ul>
       <li style="width:5%">序号</li>
       <li style="width:8%">姓名<span class="red">*</span></li>
       <li style="width:8%">1-男 2-女<span class="red">*</span></li>
       <li style="width:10%">子系统ID<span class="red">*</span></li>
       <li style="width:10%">爱好<span class="red">*</span></li>
       <li style="width:10%">科目<span class="red">*</span></li>
       <li style="width:10%">机构<span class="red">*</span></li>
       <li style="width:10%">区域<span class="red">*</span></li>
       <li style="width:10%">区域多选<span class="red">*</span></li>
       <li style="width:10%">相关附件<span class="red">*</span></li>
       <li style="width:%">操作</li>
    </ul>
    </div>
    <div class="tbody" id="dbdth">
    <#list listKf_dbdth as kf_dbdth>
    <ul>
        <li style="width:5%"><span class="lisxh"></span></li>
       <li style="width:8%">
           <@xy.text type="text" value=kf_dbdth.name id=kf_dbdth.id+"name" name="name" position="search"/>
       </li>
       <li style="width:8%">
           <@xy.radio list=sexData value=kf_dbdth.sex name=kf_dbdth.id+"sex" position="search"/>
       </li>
       <li style="width:10%">
           <@xy.select headerValue="请选择" list=zxtidData value=kf_dbdth.zxtid id=kf_dbdth.id+"zxtid" name="zxtid" position="search"/>
       </li>
        <li style="width:10%">
           <@xy.select multiple="multiple" list=hobbyData value=hobbyxldxArrays[kf_dbdth.id] id=kf_dbdth.id+"hobby" name="hobby" position="search"/>
        </li>
        <li style="width:10%">
           <@xy.checkbox list=subjectData value=subjectfxArrays[kf_dbdth.id] id=kf_dbdth.id+"subject" name=kf_dbdth.id+"subject" position="search"/>
        </li>
       <li style="width:10%">
           <@xy.button_group id=kf_dbdth.id+"jgmc" value=kf_dbdth.jgmc  name="jgmc" position="search" onclick="openWindowForzj(this,'${kf_dbdth.id}jg','${ZxtxxUtil.getXtwwdz(Constants.CONST_ZXT_ID_BASE, xtwwdzColumn) + PublicPageHelper.JG_TREE}','small','机构选择');"/>
           <@xy.text value=kf_dbdth.jg id=kf_dbdth.id+"jgxz" name="jg" type="hidden"/>
       </li>
       <li style="width:10%">
           <@xy.code lbbs="XZQY" id=kf_dbdth.id+"code_qy" value=kf_dbdth.qy  name=kf_dbdth.id+"code_qy" position="search"/>
       </li>
        <li style="width:10%">
            <@xy.code check="true" lbbs="XZQY" id=kf_dbdth.id+"more_qydx" value=kf_dbdth.qydx  name=kf_dbdth.id+"more_qydx" position="search"/>
        </li>
        <li style="width:10%">
           <@xy.upload styleys="uploadbt mini" value=kf_dbdth.fj  id=kf_dbdth.id+"fj" name="fj" position="search" max_count="1" max_file_size="200mb"/>
        </li>
       <li style="width:%">
           <@xy.button type="delete_line" onclick="confirmRefresh(this,CONFIRM_TITLE_DELETE );" url="${ctx}/base/kfpt/kfyl/dbdth/deleteKf_dbdth" parameters="{'id':'${kf_dbdth.id}'}"/>
       </li>
       <@xy.text value=kf_dbdth.id name="id" type="hidden"/>
    </ul>
    </#list>
    </div>
</div>
    <!-- 数据新增模板  开始  -->
    <div id="sjmb" style="display:none">
    <ul>
        <li style="width:5%"><span class="lisxh"></span></li>
        <li style="width:8%">
            <@xy.text type="text" value="" id="sjmbid_name" name="sjmbid_name" position="search"/>
        </li>
        <li style="width:8%">
            <@xy.radio list=sexData value="" name="sjmbid_sex" position="search"/>
        </li>
        <li style="width:10%">
            <@xy.select headerValue="请选择" list=zxtidData value="" id="sjmbid_zxtid" name="sjmbid_zxtid" position="search"/>
        </li>
        <li style="width:10%">
            <@xy.select multiple="multiple" list=hobbyData value=hobbyxldxArrays["sjmbid_"] id="sjmbid_hobby" name="sjmbid_hobby" position="search"/>
        </li>
        <li style="width:10%">
            <@xy.checkbox list=subjectData value=subjectfxArrays["sjmbid_"] id="sjmbid_subject" name="sjmbid_subject" position="search"/>
        </li>
        <li style="width:10%">
            <@xy.button_group id="sjmbid_jgmc" value=""  name="sjmbid_jgmc" position="search" onclick="openWindowForzj(this,'sjmbid_jg','${ZxtxxUtil.getXtwwdz(Constants.CONST_ZXT_ID_BASE, xtwwdzColumn) + PublicPageHelper.JG_TREE}','small','机构选择');" />
            <@xy.text value=kf_dbdth.jg id="sjmbid_jgxz" name="sjmbid_jg" type="hidden"/>
        </li>
        <li style="width:10%">
            <@xy.code lbbs="XZQY" id="sjmbid_code_qy" value=""  name="sjmbid_code_qy" position="search" />
        </li>
        <li style="width:10%">
            <@xy.code check="true" lbbs="XZQY" id="sjmbid_more_qydx" name="sjmbid_more_qydx" position="search" />
        </li>
        <li style="width:10%">
            <@xy.upload value="" styleys="uploadbt mini" id="sjmbid_fj" name="sjmbid_fj" position="search" max_count="1" max_file_size="200mb"/>
        </li>
        <li style="width:%">
            <@xy.button type="delete_line" onclick="return delKf_dbdth(this)" id="sjmbid_"/>
        </li>
        <@xy.text value="sjmbid_" name="id" type="hidden"/>
    </ul>
    </div>
    <!-- 数据新增模板  结束  -->
    <@xy.text value="" id="kf_dbdthListJson" name="kf_dbdthListJson" type="hidden"/>
</@xy.form>
<@xy.foot_script >
    <@xy.scriptCurrent src="js/base/kfpt/kfyl/dbdth/dbdthvalidate.js"/>
</@xy.foot_script>
<script type="text/javascript">
    var buttonId;
    $(function () {
        window.addEventListener('message', function (e) {
            var datas = JSON.parse(e.data);
            if (datas.method == "sendRyValue") {
                $("#" + buttonId + "xz").val(datas.params.ryid);
                $("#" + buttonId + "mc").val(datas.params.rymc);
                shut(datas.params.windowName);
            }
            if (datas.method == "sendZzValue") {
                $("#" + buttonId + "xz").val(datas.params.zzid);
                $("#" + buttonId + "mc").val(datas.params.zzmc);
                shut(datas.params.windowName);
            }
        }, false);
        
    });
    function openWindowForzj(obj, buttonid, url,size,title) {
        buttonId = buttonid;
        openWindow({
            action: url,
            size:size,
            title:title
        })
    }
    $(function () {
        $("#formx").validate(validate);
        <#list listKf_dbdth as kf_dbdth>
        $('#${kf_dbdth.id}name').rules('add', {
            required: true
        });
        $("input[name='${kf_dbdth.id}sex']").rules('add', {
            required: true
        });
        $('#${kf_dbdth.id}zxtid').rules('add', {
            required: true
        });
        $('#${kf_dbdth.id}hobby').rules('add', {
            required: true
        });
        $("input[name='${kf_dbdth.id}subject']").rules('add', {
            required: true
        });
        $('#${kf_dbdth.id}jgmc').rules('add', {
            required: true
        });
        $('#${kf_dbdth.id}code_qy').rules('add', {
            required: true
        });
        $('#${kf_dbdth.id}more_qydx').rules('add', {
            required: true
        });
        $('#${kf_dbdth.id}fj').rules('add', {
            file_required: true
        });
        </#list>
        sortSxh("dbdth");
    });
    function sortSxh(tableid){
        $("#"+tableid).find("span[class='lisxh']").each(function (index) {
            $(this).html(index+1);
        });
    }
    function submitx(obj, formid) {
        zzzl();
        if ($("#" + formid).validate(validate).form()) {
            hold(obj, function (returnValue) {
                popupOk(returnValue, function () {
                    refresh();
                }, function () {
                    $("#" + formid).validate(validate).form();
                })
            })
        }
    }
    function zzzl() {
        var listKf_dbdth = [];
        $("#dbdth").children("ul").each(function () {
            var mapKf_dbdth = {};
            $(this).find("select").each(function () {
                var thisname = $(this).attr("name");
                if(thisname.indexOf("add_")===0){
                    mapKf_dbdth[$(this).attr("name").substr(36)] = $(this).val();
                }else{
                    mapKf_dbdth[$(this).attr("name")] = $(this).val();
                }
            });
            $(this).find("textarea").each(function () {
                var thisname = $(this).attr("name");
                if(thisname.indexOf("add_")===0){
                    mapKf_dbdth[$(this).attr("name").substr(36)] = $(this).val();
                }else{
                    mapKf_dbdth[$(this).attr("name")] = $(this).val();
                }
            });
            $(this).find("input").each(function () {
                if ($(this).attr("type") === "radio") {
                    var radioName = $(this).attr("name");
                    var radioStr = 'input:radio[name="' + radioName + '"]:checked';
                    var radioVal = $(radioStr).val();
                    if (radioVal != null) {
                        if(radioName.indexOf("add_")===0){
                            mapKf_dbdth[radioName.substr(36)] = radioVal;
                        }else{
                            mapKf_dbdth[radioName.substr(32)] = radioVal;
                        }
                    }
                } else if ($(this).attr("type") === "checkbox") {
                    var checkboxName = $(this).attr("name");
                    var checkboxStr = 'input:checkbox[name="' + checkboxName + '"]:checked';
                    var checkboxValStr = "";
                    if ($(checkboxStr).length > 1) {
                        $(checkboxStr).each(function (i) {
                            if (i === 0) {
                                checkboxValStr += $(this).val();
                            } else {
                                checkboxValStr += "," + $(this).val();
                            }
                        });
                    } else {
                        checkboxValStr = $(checkboxStr).val();
                    }
                    if(checkboxName.indexOf("add_")===0){
                        mapKf_dbdth[checkboxName.substr(36)] = checkboxValStr;
                    }else{
                        mapKf_dbdth[checkboxName.substr(32)] = checkboxValStr;
                    }
                } else if ($(this).attr("name") !== undefined) {
                    var thisname = $(this).attr("name");
                    if (thisname.indexOf("code") !== -1) {
                        if(thisname.indexOf("add_")===0){
                            mapKf_dbdth[thisname.substr(41)] = $(this).val();
                        }else{
                            mapKf_dbdth[thisname.substr(37)] = $(this).val();
                        }
                    } else if (thisname.indexOf("pic_") === -1 && thisname.indexOf("cal_") === -1 && thisname.indexOf("fj_") === -1 && thisname.indexOf("more_") === -1) {
                        if(thisname.indexOf("add_")===0){
                            mapKf_dbdth[thisname.substr(36)] = $(this).val();
                        }else{
                            mapKf_dbdth[thisname] = $(this).val();
                        }
                    }
                }
            });
            $(this).find("select").each(function () {
                if ($(this).attr("multiple") === "multiple") {
                    var xlkName = $(this).attr("name");
                    var xlkdxArr = mapKf_dbdth[xlkName];
                    if(xlkdxArr==null){
                        xlkdxArr=$(this).val();
                    }
                    var xlkdxStr = "";
                    if (xlkdxArr != null) {
                        for (var i = 0; i < xlkdxArr.length; i++) {
                            if (i == 0) {
                                xlkdxStr += xlkdxArr[i];
                            } else {
                                xlkdxStr += "," + xlkdxArr[i];
                            }
                        }
                    }
                    if(xlkName.indexOf("add_")===0){
                        mapKf_dbdth[xlkName.substr(36)] = xlkdxStr;
                    }else{
                        mapKf_dbdth[xlkName] = xlkdxStr;
                    }
                }
            });
            listKf_dbdth.push(mapKf_dbdth);
        });
        $("#kf_dbdthListJson").val(JSON.stringify(listKf_dbdth));
    }
    String.prototype.format = function() {
        if(arguments.length == 0) return this;
        var obj = arguments[0];
        var s = this;
        for(var key in obj) {
            s = s.replace(new RegExp(key , "g"), obj[key]);
        }
        return s;
    }
    function addKf_dbdth() {
        $(".nodata").hide();
        var uuid = guid();
        var rows = $("#dbdth").children("ul").length;
        var data = {
            sjmbid_:"add_"+uuid,
            trid:rows+1
        }
        var config = {
            search_contains: true,
            disable_search_threshold: 5,
            no_results_text: '未找到搜索的关键字:',
            width:"100%"
        }
        $("#sjmbid_fj").val(guid());
        $("#dbdth").append($("#sjmb").html().format(data));
        $('#add_'+uuid+'name').rules('add', {
            required: true
        });
        $('input[name=add_'+uuid+'sex]').rules('add', {
            required: true
        });
        $('#add_'+uuid+'zxtid').rules('add', {
            required: true
        });
        $('#add_'+uuid+'zxtid_chosen').remove();
        $('#add_'+uuid+'zxtid').chosen(config);
        $('#add_'+uuid+'hobby').rules('add', {
            required: true
        });
        $('#add_'+uuid+'hobby_chosen').remove();
        $('#add_'+uuid+'hobby').chosen(config);
        $('input[name=add_'+uuid+'subject]').rules('add', {
            required: true
        });
        $('#add_'+uuid+'jgmc').rules('add', {
            required: true
        });
        $('#add_'+uuid+'code_qy').rules('add', {
            required: true
        });
        $('#add_'+uuid+'more_qydx').rules('add', {
            required: true
        });
        $('#add_'+uuid+'fj').rules('add', {
            file_required: true
        });
        sortSxh("dbdth");
    }
    function delKf_dbdth(obj) {
        if(confirm("您确定要删除此数据吗？")) {
            //获取table的tr，用于判断是否展示nodata
            if($("#dbdth").children("ul").length<2){
                $(".nodata").show();
            }
            var deleteId = obj.id;
            $('#'+deleteId+'name').rules('remove');
            $('input[name='+deleteId+'sex]').rules('remove');
            $('#'+deleteId+'zxtid').rules('remove');
            $('#'+deleteId+'hobby').rules('remove');
            $('input[name='+deleteId+'subject]').rules('remove');
            $('#'+deleteId+'jgmc').rules('remove');
            $('#'+deleteId+'code_qy').rules('remove');
            $('#'+deleteId+'more_qydx').rules('remove');
            $('#'+deleteId+'fj').rules('remove');
            var delTab=$(obj).parents("ul:first");
            delTab.remove();
            sortSxh("dbdth");
            return true;
        }else{
            return false;
        }
    }
</script>
<@xy.page_footer>
</@xy.page_footer>
</@xy.content_body>
</@xy.page_content>
</@xy.container>
</@xy.html_body>
</@xy.html>
