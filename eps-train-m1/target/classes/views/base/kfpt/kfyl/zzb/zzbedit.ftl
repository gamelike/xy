<@xy.html>
<@xy.html_head value="主子表父表[kf_zzb_fb]管理">
</@xy.html_head>
<@xy.html_body>
<@xy.nav />
<@xy.container>
<@xy.page_content>
<@xy.content_title value="编辑主子表父表[kf_zzb_fb]">
</@xy.content_title>
<@xy.content_body>
<@xy.form id="formx" >
<@xy.content_body type="edit">
    <@xy.text label="单行文本框" type="text" value=kf_zzb_fb.danhwb name="danhwb" id="danhwb" position="edit" placeholder="单行文本框" required=true />
    <@xy.textarea label="多行文本框" value=kf_zzb_fb.duohwb name="duohwb" id="duohwb" position="edit" placeholder="多行文本框" required=true />
    <@xy.select label="下拉框" placeholder="请选择" headerValue="请选择" list=xlkData value=kf_zzb_fb.xlk name="xlk" id="xlk" position="edit" placeholder="下拉框" required=true />
    <@xy.select label="下拉框多选" multiple="multiple" headerValue="请选择" list=xlkdxData value=xlkdxArrays name="xlkdx" id="xlkdx" position="edit" placeholder="下拉框多选" required=true />
    <@xy.radio label="单选按钮" list=dxkData value=kf_zzb_fb.dxk name="dxk" position="edit" required=true />
    <@xy.checkbox label="复选框" list=fxkData value=fxkArrays name="fxk" position="edit" required=true />
    <@xy.calendar label="日期" id=rq+"rq" placeholder="日期" time=false value=kf_zzb_fb.rq  name="rq" position="edit" required=true />
    <@xy.calendar label="日期时间" id=rqsj+"rqsj" placeholder="日期时间" value=kf_zzb_fb.rqsj  name="rqsj" position="edit" required=true />
    <@xy.button_group label="用户" id="yhmc" placeholder="用户" value=kf_zzb_fb.yhmc  name="yhmc" position="edit" onclick="openWindowForzj(this,'yh','${ZxtxxUtil.getXtwwdz(Constants.CONST_ZXT_ID_BASE, xtwwdzColumn) + PublicPageHelper.RY_TREE}','nomal');" required=true />
    <@xy.text value=kf_zzb_fb.yh id="yhxz" name="yh" type="hidden"/>
    <@xy.button_group label="机构" id="jgmc" placeholder="机构" value=kf_zzb_fb.jgmc  name="jgmc" position="edit" onclick="openWindowForzj(this,'jg','${ZxtxxUtil.getXtwwdz(Constants.CONST_ZXT_ID_BASE, xtwwdzColumn) + PublicPageHelper.JG_TREE}','small','选择机构');" required=true />
    <@xy.text value=kf_zzb_fb.jg id="jgxz" name="jg" type="hidden"/>
    <@xy.code label="区域" lbbs="XZQY" id="qy" placeholder="区域选择" value=kf_zzb_fb.qy  name="qy" position="edit" required=true />
    <@xy.code check="true" label="区域多选" lbbs="XZQY" id="qydx" placeholder="区域多选选择" value=kf_zzb_fb.qydx  name="qydx" position="edit" required= false />
    <@xy.upload label="图片" type="img" id="tp" name="tp" value=kf_zzb_fb.tp max_count="1" max_file_size="200mb" required= false />
    <@xy.upload label="附件" id="fj" name="fj" value=kf_zzb_fb.fj max_count="1" max_file_size="200mb" required= false />
</@xy.content_body>
<!-- 子表开始 -->
<@xy.content_title value="编辑Kf_zzb_zba子表信息">
<@xy.button type="add" text="增加" onclick="addKf_zzb_zba()"/>
</@xy.content_title>
<@xy.content_body>
<div class="grid-edit">
    <div class="thead">
        <ul>
            <li style="width:5%">序号</li>
            <li style="width:10%">单行文本框<span class="red">*</span></li>
            <li style="width:10%">多行文本框<span class="red">*</span></li>
            <li style="width:10%">下拉框<span class="red">*</span></li>
            <li style="width:10%">下拉框多选<span class="red">*</span></li>
            <li style="width:15%">单选按钮<span class="red">*</span></li>
            <li style="width:15%">复选框<span class="red">*</span></li>
            <li style="width:10%">日期<span class="red">*</span></li>
            <li style="width:20%">操作</li>
        </ul>
    </div>
    <div class="tbody" id="zzb_kf_zzb_zba">
    <#list listKf_zzb_zba as kf_zzb_zba>
        <ul>
            <li style="width:5%"><span class="lisxh"></span></li>
            <li style="width:10%">
                <@xy.text type="text" value=kf_zzb_zba.danhwb id=kf_zzb_zba.id+"danhwb" name="kf_zzb_zba_danhwb" position="search"/>
            </li>
            <li style="width:10%">
                <@xy.textarea autoheight=true value=kf_zzb_zba.duohwb id=kf_zzb_zba.id+"duohwb" name="kf_zzb_zba_duohwb" position="search"/>
            </li>
            <li style="width:10%">
                <@xy.select headerValue="请选择" list=xlkData value=kf_zzb_zba.xlk id=kf_zzb_zba.id+"xlk" name="kf_zzb_zba_xlk" position="search"/>
            </li>
            <li style="width:10%">
                <@xy.select multiple="multiple" list=xlkdxData value=xlkdxxldxArrays[kf_zzb_zba.id] id=kf_zzb_zba.id+"xlkdx" name="kf_zzb_zba_xlkdx" position="search"/>
            </li>
            <li style="width:15%">
                <@xy.radio list=dxkData value=kf_zzb_zba.dxk name=kf_zzb_zba.id+"dxk" position="search"/>
            </li>
            <li style="width:15%">
                <@xy.checkbox list=fxkData value=fxkfxArrays[kf_zzb_zba.id] id=kf_zzb_zba.id+"fxk" name=kf_zzb_zba.id+"fxk" position="search"/>
            </li>
            <li style="width:10%">
                <@xy.calendar id=kf_zzb_zba.id+"rq" name="kf_zzb_zba_rq" time=false value=kf_zzb_zba.rq position="search"/>
            </li>
            <li style="width:20%">
                <@xy.button  type="delete_line" onclick="confirmRefresh(this,CONFIRM_TITLE_DELETE );" url="${ctx}/base/kfpt/kfyl/zzb/deleteKf_zzb_zba" parameters="{'id':'${kf_zzb_zba.id}'}"/>
            </li>
            <@xy.text value=kf_zzb_zba.id name="kf_zzb_zba_id" type="hidden"/>
        </ul>
    </#list>
    </div>
</div>
</@xy.content_body>
<@xy.content_title value="编辑Kf_zzb_zbb子表信息">
<@xy.button type="add" text="增加" onclick="addKf_zzb_zbb()"/>
</@xy.content_title>
<@xy.content_body>
<div class="grid-edit">
    <div class="thead">
        <ul>
            <li style="width:5%">序号</li>
            <li style="width:10%">日期时间<span class="red">*</span></li>
            <li style="width:10%">用户<span class="red">*</span></li>
            <li style="width:10%">机构<span class="red">*</span></li>
            <li style="width:10%">区域<span class="red">*</span></li>
            <li style="width:15%">区域多选<span class="red">*</span></li>
            <li style="width:12%">图片<span class="red">*</span></li>
            <li style="width:12%">附件<span class="red">*</span></li>
            <li style="width:20%">操作</li>
        </ul>
    </div>
    <div class="tbody" id="zzb_kf_zzb_zbb">
    <#list listKf_zzb_zbb as kf_zzb_zbb>
        <ul>
            <li style="width:5%"><span class="lisxh"></span></li>
            <li style="width:10%">
                <@xy.calendar id=kf_zzb_zbb.id+"rqsj" name="kf_zzb_zbb_rqsj" value=kf_zzb_zbb.rqsj position="search"/>
            </li>
            <li style="width:10%">
                <@xy.button_group id=kf_zzb_zbb.id+"yhmc" value=kf_zzb_zbb.yhmc name="kf_zzb_zbb_yhmc" position="search" onclick="openWindowForzj(this,'${kf_zzb_zbb.id}yh','${ZxtxxUtil.getXtwwdz(Constants.CONST_ZXT_ID_BASE, xtwwdzColumn) + PublicPageHelper.RY_TREE}','nomal');"/>
                <@xy.text value=kf_zzb_zbb.yh id=kf_zzb_zbb.id+"yhxz" name="kf_zzb_zbb_yh" type="hidden"/>
            </li>
            <li style="width:10%">
                <@xy.button_group id=kf_zzb_zbb.id+"jgmc" value=kf_zzb_zbb.jgmc  name="kf_zzb_zbb_jgmc" position="search" onclick="openWindowForzj(this,'${kf_zzb_zbb.id}jg','${ZxtxxUtil.getXtwwdz(Constants.CONST_ZXT_ID_BASE, xtwwdzColumn) + PublicPageHelper.JG_TREE}','small','选择机构');"/>
                <@xy.text value=kf_zzb_zbb.jg id=kf_zzb_zbb.id+"jgxz" name="kf_zzb_zbb_jg" type="hidden"/>
            </li>
            <li style="width:10%">
                <@xy.code lbbs="XZQY" id=kf_zzb_zbb.id+"code_qy" value=kf_zzb_zbb.qy  name=kf_zzb_zbb.id+"code_qy" position="search"/>
            </li>
            <li style="width:15%">
                <@xy.code check="true" lbbs="XZQY" id=kf_zzb_zbb.id+"more_qydx" value=kf_zzb_zbb.qydx  name=kf_zzb_zbb.id+"more_qydx" position="search"/>
            </li>
            <li style="width:12%">
                <@xy.upload type="img" styleys="uploadbt mini" value=kf_zzb_zbb.tp id=kf_zzb_zbb.id+"tp" name="kf_zzb_zbb_tp" position="search" max_count="1" max_file_size="200mb"/>
            </li>
            <li style="width:12%">
                <@xy.upload styleys="uploadbt mini" value=kf_zzb_zbb.fj id=kf_zzb_zbb.id+"fj" name="kf_zzb_zbb_fj" position="search" max_count="1" max_file_size="200mb"/>
            </li>
            <li style="width:20%">
                <@xy.button  type="delete_line" onclick="confirmRefresh(this,CONFIRM_TITLE_DELETE );" url="${ctx}/base/kfpt/kfyl/zzb/deleteKf_zzb_zbb" parameters="{'id':'${kf_zzb_zbb.id}'}"/>
            </li>
            <@xy.text value=kf_zzb_zbb.id name="kf_zzb_zbb_id" type="hidden"/>
        </ul>
    </#list>
    </div>
</div>
</@xy.content_body>
<!-- 数据新增模板  开始  -->
<div id="sjmb_kf_zzb_zba" style="display:none">
    <ul>
        <li style="width:5%"><span class="lisxh"></span></li>
        <li style="width:10%">
            <@xy.text type="text" value="" id="sjmbid_danhwb" name="sjmbid_danhwb" position="search"/>
        </li>
        <li style="width:10%">
            <@xy.textarea autoheight=true value="" id="sjmbid_duohwb" name="sjmbid_duohwb" position="search"/>
        </li>
        <li style="width:10%">
            <@xy.select headerValue="请选择" list=xlkData value="" id="sjmbid_xlk" name="sjmbid_xlk" position="search"/>
        </li>
        <li style="width:10%">
            <@xy.select multiple="multiple" list=xlkdxData value=xlkdxxldxArrays["sjmbid_"] id="sjmbid_xlkdx" name="sjmbid_xlkdx" position="search"/>
        </li>
        <li style="width:15%">
            <@xy.radio list=dxkData value="" name="sjmbid_dxk" position="search"/>
        </li>
        <li style="width:15%">
            <@xy.checkbox list=fxkData value=fxkfxArrays["sjmbid_"] id="sjmbid_fxk" name="sjmbid_fxk" position="search"/>
        </li>
        <li style="width:10%">
            <@xy.calendar id="sjmbid_rq" name="sjmbid_rq" time=false value="" position="search"/>
        </li>
        <li style="width:20%">
            <@xy.button type="delete_line" onclick="return delKf_zzb_zba(this)" id="sjmbid_"/>
        </li>
        <@xy.text value="sjmbid_" name="sjmbid_id" type="hidden"/>
    </ul>
    </div>
    <@xy.text value="" id="kf_zzb_zbaListJson" name="kf_zzb_zbaListJson" type="hidden"/>
<div id="sjmb_kf_zzb_zbb" style="display:none">
    <ul>
        <li style="width:5%"><span class="lisxh"></span></li>
        <li style="width:10%">
            <@xy.calendar id="sjmbid_rqsj" name="sjmbid_rqsj" value="" position="search"/>
        </li>
        <li style="width:10%">
            <@xy.button_group id="sjmbid_yhmc" value="" name="sjmbid_yhmc" position="search"  placeholder="选择人员"  onclick="openWindowForzj(this,'sjmbid_yh','${ZxtxxUtil.getXtwwdz(Constants.CONST_ZXT_ID_BASE, xtwwdzColumn) + PublicPageHelper.RY_TREE}','nomal');"/>
            <@xy.text value=kf_zzb_zbb.yh id="sjmbid_yhxz" name="sjmbid_yh" type="hidden"/>
        </li>
        <li style="width:10%">
            <@xy.button_group id="sjmbid_jgmc" value=""  name="sjmbid_jgmc" position="search" onclick="openWindowForzj(this,'sjmbid_jg','${ZxtxxUtil.getXtwwdz(Constants.CONST_ZXT_ID_BASE, xtwwdzColumn) + PublicPageHelper.JG_TREE}','small','选择机构');"/>
            <@xy.text value=kf_zzb_zbb.jg id="sjmbid_jgxz" name="sjmbid_jg" type="hidden"/>
        </li>
        <li style="width:10%">
            <@xy.code lbbs="XZQY" id="sjmbid_code_qy" value=""  name="sjmbid_code_qy" position="search"/>
        </li>
        <li style="width:15%">
            <@xy.code check="true" lbbs="XZQY" id="sjmbid_more_qydx" name="sjmbid_more_qydx" position="search"/>
        </li>
        <li style="width:12%">
            <@xy.upload styleys="uploadbt mini" type="img" value="" id="sjmbid_tp" name="sjmbid_tp" position="search" max_count="1" max_file_size="200mb"/>
        </li>
        <li style="width:12%">
            <@xy.upload styleys="uploadbt mini" value="" id="sjmbid_fj" name="sjmbid_fj" position="search" max_count="1" max_file_size="200mb"/>
        </li>
        <li style="width:20%">
            <@xy.button type="delete_line" onclick="return delKf_zzb_zbb(this)" id="sjmbid_"/>
        </li>
        <@xy.text value="sjmbid_" name="sjmbid_id" type="hidden"/>
    </ul>
    </div>
    <@xy.text value="" id="kf_zzb_zbbListJson" name="kf_zzb_zbbListJson" type="hidden"/>
<!-- 数据新增模板  结束  -->
<!-- 子表结束 -->
<@xy.content_submit>
    <@xy.button url="${ctx}/base/kfpt/kfyl/zzb/saveKf_zzb_fb" type="save_bottom" onclick="submitx(this,'formx')"/>
    <@xy.button url="${ctx}/base/kfpt/kfyl/zzb/submitKf_zzb_fb" type="submit_bottom" onclick="submittj(this,'form')"/>
    <@xy.button type="back_bottom" onclick="back('${ctx}/base/kfpt/kfyl/zzb')"/>
</@xy.content_submit>
    <@xy.text value=kf_zzb_fb.id name="id" id="id" type="hidden"/>
    <@xy.text value=kf_zzb_fb.id name="kf_zzb_fb_id" id="kf_zzb_fb_id" type="hidden"/>
    <@xy.text value=kf_zzb_fb.fid name="kf_zzb_fb_fid" id="kf_zzb_fb_fid" type="hidden"/>
    <@xy.text value=kf_zzb_fb.id name="kf_zzb_fb_id" id="kf_zzb_fb_id" type="hidden"/>
    <@xy.text value=kf_zzb_fb.fid name="kf_zzb_fb_fid" id="kf_zzb_fb_fid" type="hidden"/>
</@xy.form>
<@xy.foot_script >
    <@xy.scriptCurrent src="js/base/kfpt/kfyl/zzb/zzbvalidateAll.js"/>
</@xy.foot_script>
<script type="text/javascript">
    var buttonId;
    $(function () {
        $("#formx").find("input, select, textarea").not(":submit, :reset, :image, [disabled]").each(function () {
            $(this).keydown(function () {
                if ($(this).closest(".col-sm-5").next().length == 1) {
                    $(this).closest(".col-sm-5").next().html("");
                } else {
                    $(this).parent().attr("data-original-title", "");
                    $(this).parent().tooltip('hide');
                }
                $(this).removeClass("error");
            });
        });
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
    function submitx(obj, formid) {
        xzzl_kf_zzb_zba();
        xzzl_kf_zzb_zbb();
        if ($("#" + formid).validate(validate).form()) {
            hold(obj, function (returnValue) {
                popupOk(returnValue, function () {
                    back("${ctx}/base/kfpt/kfyl/zzb");
                }, function () {
                    $("#" + formid).validate(validate).form();
                })
            })
        }
    }
    $(function () {
        $("#formx").validate(validate);
<#list listKf_zzb_zba as kf_zzb_zba>
        $('#${kf_zzb_zba.id}danhwb').rules('add', {
            required: true
        });
        $('#${kf_zzb_zba.id}duohwb').rules('add', {
            required: true
        });
        $('#${kf_zzb_zba.id}xlk').rules('add', {
            required: true
        });
        $('#${kf_zzb_zba.id}xlkdx').rules('add', {
            required: true
        });
        $("input[name='${kf_zzb_zba.id}dxk']").rules('add', {
            required: true
        });
        $("input[name='${kf_zzb_zba.id}fxk']").rules('add', {
            required: true
        });
        $('#${kf_zzb_zba.id}rq').rules('add', {
            required: true
        });
</#list>
        sortSxh("zzb_kf_zzb_zba");
<#list listKf_zzb_zbb as kf_zzb_zbb>
        $('#${kf_zzb_zbb.id}rqsj').rules('add', {
            required: true
        });
        $('#${kf_zzb_zbb.id}yhmc').rules('add', {
            required: true
        });
        $('#${kf_zzb_zbb.id}jgmc').rules('add', {
            required: true
        });
        $('#${kf_zzb_zbb.id}code_qy').rules('add', {
                required: true
        });
        $('#${kf_zzb_zbb.id}more_qydx').rules('add', {
            required: true
        });
        $('#${kf_zzb_zbb.id}tp').rules('add', {
            file_required: true
        });
        $('#${kf_zzb_zbb.id}fj').rules('add', {
            file_required: true
        });
</#list>
        sortSxh("zzb_kf_zzb_zbb");
    });
    function startProcess() {
        verify("确定提交流程吗？", function () {
            ajaxDefault("${ctx}/base/kfpt/kfyl/zzb/startProcess", {'kf_zzb_fb_id': '${kf_zzb_fb.id}'}, function (returnValue) {
                if (returnValue.state == 1) {
                    popupOk(returnValue, function () {
                        forward({
                            target: '_top',
                            action: returnValue.data
                        });
                    });
                } else {
                    msg(returnValue.text, returnValue.state);
                }
            });
        }, null, true);
    }

        function xzzl_kf_zzb_zba() {
            var listKf_zzb_zba = [];
            $("#zzb_kf_zzb_zba").children("ul").each(function () {
                var mapKf_zzb_zba = {};
                $(this).find("select").each(function () {
                    var thisname = $(this).attr("name");
                    if(thisname.indexOf("add_")===0){
                        mapKf_zzb_zba[$(this).attr("name").substr(36)] = $(this).val();
                    }else if(thisname.indexOf("kf_zzb_zba")===0){
                        mapKf_zzb_zba[thisname.substr("kf_zzb_zba".length+1)] = $(this).val();
                    }else{
                        mapKf_zzb_zba[$(this).attr("name")] = $(this).val();
                    }
                });
                $(this).find("textarea").each(function () {
                    var thisname = $(this).attr("name");
                    if(thisname.indexOf("add_")===0){
                        mapKf_zzb_zba[thisname.substr(36)] = $(this).val();
                    }else if(thisname.indexOf("kf_zzb_zba")===0){
                        mapKf_zzb_zba[thisname.substr("kf_zzb_zba".length+1)] = $(this).val();
                    }else{
                        mapKf_zzb_zba[thisname] = $(this).val();
                    }
                });
                $(this).find("input").each(function () {
                    if ($(this).attr("type") === "radio") {
                        var radioName = $(this).attr("name");
                        var radioStr = 'input:radio[name="' + radioName + '"]:checked';
                        var radioVal = $(radioStr).val();
                        if (radioVal != null) {
                            if(radioName.indexOf("add_")===0){
                                mapKf_zzb_zba[radioName.substr(36)] = radioVal;
                            }else if(radioName.indexOf("kf_zzb_zba")===0){
                                mapKf_zzb_zba[radioName.substr("kf_zzb_zba".length+1)] = $(this).val();
                            }else{
                                mapKf_zzb_zba[radioName.substr(32)] = radioVal;
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
                            mapKf_zzb_zba[checkboxName.substr(36)] = checkboxValStr;
                        }else if(checkboxName.indexOf("kf_zzb_zba")===0){
                            mapKf_zzb_zba[checkboxName.substr("kf_zzb_zba".length+1)] = checkboxValStr;
                        }else{
                            mapKf_zzb_zba[checkboxName.substr(32)] = checkboxValStr;
                        }
                    } else if ($(this).attr("name") !== undefined) {
                        var thisname = $(this).attr("name");
                        if (thisname.indexOf("code") !== -1) {
                            if(thisname.indexOf("add_")===0){
                                mapKf_zzb_zba[thisname.substr(41)] = $(this).val();
                            }else if(thisname.indexOf("kf_zzb_zba")===0){
                                mapKf_zzb_zba[thisname.substr("kf_zzb_zba".length+1)] = $(this).val();
                            }else{
                                mapKf_zzb_zba[thisname.substr(37)] = $(this).val();
                            }
                        } else if (thisname.indexOf("tp_") === -1 && thisname.indexOf("pic_") === -1 && thisname.indexOf("cal_") === -1 && thisname.indexOf("fj_") === -1 && thisname.indexOf("more_") === -1) {
                            if(thisname.indexOf("add_")===0){
                                mapKf_zzb_zba[thisname.substr(36)] = $(this).val();
                            }else if(thisname.indexOf("kf_zzb_zba")===0){
                                mapKf_zzb_zba[thisname.substr("kf_zzb_zba".length+1)] = $(this).val();
                            }else{
                                mapKf_zzb_zba[thisname] = $(this).val();
                            }
                        }
                    }
                });
                $(this).find("select").each(function () {
                    if ($(this).attr("multiple") === "multiple") {
                        var xlkName = $(this).attr("name");
                        var xlkdxArr = mapKf_zzb_zba[xlkName];
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
                            mapKf_zzb_zba[xlkName.substr(36)] = xlkdxStr;
                        }else if(xlkName.indexOf("kf_zzb_zba")===0){
                            mapKf_zzb_zba[xlkName.substr("kf_zzb_zba".length+1)] = xlkdxStr;
                        }else{
                            mapKf_zzb_zba[xlkName] = xlkdxStr;
                        }
                    }
                });
                listKf_zzb_zba.push(mapKf_zzb_zba);
            });
            $("#kf_zzb_zbaListJson").val(JSON.stringify(listKf_zzb_zba));
        }
        function xzzl_kf_zzb_zbb() {
            var listKf_zzb_zbb = [];
            $("#zzb_kf_zzb_zbb").children("ul").each(function () {
                var mapKf_zzb_zbb = {};
                $(this).find("select").each(function () {
                    var thisname = $(this).attr("name");
                    if(thisname.indexOf("add_")===0){
                        mapKf_zzb_zbb[$(this).attr("name").substr(36)] = $(this).val();
                    }else if(thisname.indexOf("kf_zzb_zbb")===0){
                        mapKf_zzb_zbb[thisname.substr("kf_zzb_zbb".length+1)] = $(this).val();
                    }else{
                        mapKf_zzb_zbb[$(this).attr("name")] = $(this).val();
                    }
                });
                $(this).find("textarea").each(function () {
                    var thisname = $(this).attr("name");
                    if(thisname.indexOf("add_")===0){
                        mapKf_zzb_zbb[thisname.substr(36)] = $(this).val();
                    }else if(thisname.indexOf("kf_zzb_zbb")===0){
                        mapKf_zzb_zbb[thisname.substr("kf_zzb_zbb".length+1)] = $(this).val();
                    }else{
                        mapKf_zzb_zbb[thisname] = $(this).val();
                    }
                });
                $(this).find("input").each(function () {
                    if ($(this).attr("type") === "radio") {
                        var radioName = $(this).attr("name");
                        var radioStr = 'input:radio[name="' + radioName + '"]:checked';
                        var radioVal = $(radioStr).val();
                        if (radioVal != null) {
                            if(radioName.indexOf("add_")===0){
                                mapKf_zzb_zbb[radioName.substr(36)] = radioVal;
                            }else if(radioName.indexOf("kf_zzb_zbb")===0){
                                mapKf_zzb_zbb[radioName.substr("kf_zzb_zbb".length+1)] = $(this).val();
                            }else{
                                mapKf_zzb_zbb[radioName.substr(32)] = radioVal;
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
                            mapKf_zzb_zbb[checkboxName.substr(36)] = checkboxValStr;
                        }else if(checkboxName.indexOf("kf_zzb_zbb")===0){
                            mapKf_zzb_zbb[checkboxName.substr("kf_zzb_zbb".length+1)] = checkboxValStr;
                        }else{
                            mapKf_zzb_zbb[checkboxName.substr(32)] = checkboxValStr;
                        }
                    } else if ($(this).attr("name") !== undefined) {
                        var thisname = $(this).attr("name");
                        if (thisname.indexOf("code") !== -1) {
                            if(thisname.indexOf("add_")===0){
                                mapKf_zzb_zbb[thisname.substr(41)] = $(this).val();
                            }else if(thisname.indexOf("kf_zzb_zbb")===0){
                                mapKf_zzb_zbb[thisname.substr("kf_zzb_zbb".length+1)] = $(this).val();
                            }else{
                                mapKf_zzb_zbb[thisname.substr(37)] = $(this).val();
                            }
                        } else if (thisname.indexOf("tp_") === -1 && thisname.indexOf("pic_") === -1 && thisname.indexOf("cal_") === -1 && thisname.indexOf("fj_") === -1 && thisname.indexOf("more_") === -1) {
                            if(thisname.indexOf("add_")===0){
                                mapKf_zzb_zbb[thisname.substr(36)] = $(this).val();
                            }else if(thisname.indexOf("kf_zzb_zbb")===0){
                                mapKf_zzb_zbb[thisname.substr("kf_zzb_zbb".length+1)] = $(this).val();
                            }else{
                                mapKf_zzb_zbb[thisname] = $(this).val();
                            }
                        }
                    }
                });
                $(this).find("select").each(function () {
                    if ($(this).attr("multiple") === "multiple") {
                        var xlkName = $(this).attr("name");
                        var xlkdxArr = mapKf_zzb_zbb[xlkName];
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
                            mapKf_zzb_zbb[xlkName.substr(36)] = xlkdxStr;
                        }else if(xlkName.indexOf("kf_zzb_zba")===0){
                            mapKf_zzb_zbb[xlkName.substr("kf_zzb_zbb".length+1)] = xlkdxStr;
                        }else{
                            mapKf_zzb_zbb[xlkName] = xlkdxStr;
                        }
                    }
                });
                listKf_zzb_zbb.push(mapKf_zzb_zbb);
            });
            $("#kf_zzb_zbbListJson").val(JSON.stringify(listKf_zzb_zbb));
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

    function sortSxh(tableid){
        $("#"+tableid).find("span[class='lisxh']").each(function (index) {
            $(this).html(index+1);
        });
    }
        function addKf_zzb_zba() {
            $(".nodata").hide();
            var uuid = guid();
            var data = {
                sjmbid_:"add_"+uuid
            }
            var config = {
                search_contains: true,
                disable_search_threshold: 5,
                no_results_text: '未找到搜索的关键字:',
                width:"100%"
            }
            $("#zzb_kf_zzb_zba").append($("#sjmb_kf_zzb_zba").html().format(data));
                $('#add_'+uuid+'danhwb').rules('add', {
                    required: true
                });
                $('#add_'+uuid+'duohwb').rules('add', {
                    required: true
                });
                $('#add_'+uuid+'xlk').rules('add', {
                    required: true
                });
                $('#add_'+uuid+'xlk_chosen').remove();
                $('#add_'+uuid+'xlk').chosen(config);
                $('#add_'+uuid+'xlkdx').rules('add', {
                    required: true
                });
                $('#add_'+uuid+'xlkdx_chosen').remove();
                $('#add_'+uuid+'xlkdx').chosen(config);
                $('input[name=add_'+uuid+'dxk]').rules('add', {
                    required: true
                });
                $('input[name=add_'+uuid+'fxk]').rules('add', {
                    required: true
                });
                $('#add_'+uuid+'rq').rules('add', {
                    required: true
                });
            sortSxh("zzb_kf_zzb_zba");
        }
        function addKf_zzb_zbb() {
            $(".nodata").hide();
            var uuid = guid();
            var data = {
                sjmbid_:"add_"+uuid
            }
            var config = {
                search_contains: true,
                disable_search_threshold: 5,
                no_results_text: '未找到搜索的关键字:',
                width:"100%"
            }
            $("#sjmbid_tp").val(guid());
            $("#sjmbid_fj").val(guid());
            $("#zzb_kf_zzb_zbb").append($("#sjmb_kf_zzb_zbb").html().format(data));
                $('#add_'+uuid+'rqsj').rules('add', {
                    required: true
                });
                $('#add_'+uuid+'yhmc').rules('add', {
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
                $('#add_'+uuid+'tp').rules('add', {
                    file_required: true
                });
                $('#add_'+uuid+'fj').rules('add', {
                    file_required: true
                });
            sortSxh("zzb_kf_zzb_zbb");
        }
        function delKf_zzb_zba(obj) {
            if(confirm("您确定要删除此数据吗？")) {
                //获取table的tr，用于判断是否展示nodata
                if($("#zzb_kf_zzb_zba").children("ul").length<2){
                    $(".nodata").show();
                }
                var deleteId = obj.id;
                $('#'+deleteId+'danhwb').rules('remove');
                $('#'+deleteId+'duohwb').rules('remove');
                $('#'+deleteId+'xlk').rules('remove');
                $('#'+deleteId+'xlkdx').rules('remove');
                $('input[name='+deleteId+'dxk]').rules('remove');
                $('input[name='+deleteId+'fxk]').rules('remove');
                $('#'+deleteId+'rq').rules('remove');
                var delTab=$(obj).parents("ul:first");
                delTab.remove();
                sortSxh("zzb_kf_zzb_zba");
                return true;
            }else{
                return false;
            }
        }
        function delKf_zzb_zbb(obj) {
            if(confirm("您确定要删除此数据吗？")) {
                //获取table的tr，用于判断是否展示nodata
                if($("#zzb_kf_zzb_zbb").children("ul").length<2){
                    $(".nodata").show();
                }
                var deleteId = obj.id;
                $('#'+deleteId+'rqsj').rules('remove');
                $('#'+deleteId+'yhmc').rules('remove');
                $('#'+deleteId+'jgmc').rules('remove');
                $('#'+deleteId+'code_qy').rules('remove');
                $('#'+deleteId+'more_qydx').rules('remove');
                $('#'+deleteId+'tp').rules('remove');
                $('#'+deleteId+'fj').rules('remove');
                var delTab=$(obj).parents("ul:first");
                delTab.remove();
                sortSxh("zzb_kf_zzb_zbb");
                return true;
            }else{
                return false;
            }
        }

    function submittj(obj, formid) {
        verify("确定要提交审核吗？", function () {
            hold(obj, function (returnValue) {
                popupOk(returnValue, function () {
                    back('${ctx}/base/kfpt/kfyl/zzb');
                })
            })
        });
    }
</script>
</@xy.content_body>
</@xy.page_content>
<@xy.page_footer>
</@xy.page_footer>
</@xy.container>
</@xy.html_body>
</@xy.html>

