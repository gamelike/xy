<@xy.html>
<@xy.html_head value="单表增删查改[kf_dbzscg]管理">
</@xy.html_head>
<@xy.html_body>
<@xy.nav/>
<@xy.container>
<@xy.page_content>
<@xy.content_title value="编辑单表增删查改[kf_dbzscg]">
</@xy.content_title>
<@xy.content_body type="edit">
<@xy.form id="form">
    <@xy.text label="单行文本框" type="text" value=kf_dbzscg.danhwb name="danhwb" id="danhwb" position="edit" placeholder="单行文本框" required=true />
    <@xy.textarea label="多行文本框" value=kf_dbzscg.duohwb name="duohwb" id="duohwb" position="edit" placeholder="多行文本框" required=true />
    <@xy.select label="下拉框" headerValue="请选择" placeholder="请选择" list=xlkData value=kf_dbzscg.xlk name="xlk" id="xlk" position="edit" required=true />
    <@xy.select label="下拉框多选" multiple="multiple" listValue="name" headerValue="请选择" list=xlkdxData value=xlkdxArrays name="xlkdx" id="xlkdx" position="edit" placeholder="下拉框多选" required=true />
    <@xy.radio label="单选按钮" list=dxkData value=kf_dbzscg.dxk name="dxk" position="edit" required=true />
    <@xy.checkbox label="复选框" list=fxkData value=fxkArrays name="fxk" position="edit" required=true />
    <@xy.calendar label="日期" id="rq" placeholder="日期" time=false value=kf_dbzscg.rq name="rq" position="edit" required=true />
    <@xy.calendar label="日期时间" id="rqsj" placeholder="日期时间" value=kf_dbzscg.rqsj name="rqsj" position="edit" required=true />
    <@xy.button_group label="用户" id="yhmc" placeholder="用户" value=kf_dbzscg.yhmc name="yhmc" position="edit" onclick="openWindowForzj(this,'yh','${ZxtxxUtil.getXtwwdz(Constants.CONST_ZXT_ID_BASE, xtwwdzColumn) + PublicPageHelper.RY_TREE}','nomal');" required=true />
    <@xy.text value=kf_dbzscg.yh id="yhxz" name="yh" type="hidden"/>
    <@xy.button_group label="机构" id="jgmc" placeholder="机构" value=kf_dbzscg.jgmc  name="jgmc" position="edit" onclick="openWindowForzj(this,'jg','${ZxtxxUtil.getXtwwdz(Constants.CONST_ZXT_ID_BASE, xtwwdzColumn) + PublicPageHelper.JG_TREE}','small','机构选择');" required=true />
    <@xy.text value=kf_dbzscg.jg id="jgxz" name="jg" type="hidden"/>
    <@xy.code label="区域" lbbs="XZQY" id="qy" placeholder="区域选择" value=kf_dbzscg.qy name="qy" position="edit" required=true />
    <@xy.code check="true" label="区域多选" lbbs="XZQY" id="qydx" placeholder="区域多选选择" value=kf_dbzscg.qydx name="qydx" position="edit" required=true />
    <@xy.upload label="图片" type="img" id="tp" name="tp" value=kf_dbzscg.tp max_count="1" max_file_size="200mb" required=true />
    <@xy.upload label="附件" id="fj" name="fj" value=kf_dbzscg.fj max_count="1" max_file_size="200mb" required=true />
    <@xy.textarea label="备注" value=kf_dbzscg.beiz name="beiz" id="beiz" position="edit" placeholder="备注" required=true />

<@xy.content_submit>
    <@xy.button url="${ctx}/base/kfpt/kfyl/dbzscg/saveKf_dbzscg" type="save_bottom" onclick="submitx(this,'form')"/>
    <@xy.button url="${ctx}/base/kfpt/kfyl/dbzscg/submitKf_dbzscg" type="submit_bottom" onclick="submittj(this,'form')"/>
    <@xy.button type="back_bottom" onclick="back('${ctx}/base/kfpt/kfyl/dbzscg')"/>
</@xy.content_submit>
    <@xy.text value=kf_dbzscg.id name="id" id="id" type="hidden"/>
</@xy.form>
<@xy.foot_script>
    <@xy.scriptCurrent src="js/base/kfpt/kfyl/dbzscg/dbzscgvalidate.js"/>
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
    function submitx(obj, formid) {
        $("#form").validate(validate);
        if ($("#" + formid).validate(validate).form()) {
            hold(obj, function (returnValue) {
                popupOk(returnValue, function () {
                    back("${ctx}/base/kfpt/kfyl/dbzscg");
                }, function () {
                    $("#" + formid).validate(validate).form();
                })
            })
        }
    }
    function submittj(obj, formid) {
        verify("确定要提交审核吗？", function () {
            hold(obj, function (returnValue) {
                popupOk(returnValue, function () {
                    back('${ctx}/base/kfpt/kfyl/dbzscg');
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

