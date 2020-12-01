<@xy.html>
<@xy.html_head value="主子表父表[kf_zzb_fb]管理">
</@xy.html_head>
<@xy.html_body type="popup">
<@xy.container type="popup">
<@xy.page_content type="popup">
<@xy.content_body type="popup">
<@xy.form id="form">
<ul class="sortable-list connectList agile-list">
    <#list listKf_zzb_fb as kf_zzb_fb>
    <li class="info-element">
        <div class="agile-detail row">
            <div class="col-sm-8"><@xy.text value=kf_zzb_fb.id name="kf_zzb_fb_ids" type="hidden"/><@xy.insert value=kf_zzb_fb.danhwb/></div>
            <div class="col-sm-4"></div>
        </div>
    </li>
</#list>
</ul>
<@xy.content_submit>
<@xy.button url="${ctx}/base/kfpt/kfyl/zzb/saveSortKf_zzb_fb" type="save_bottom" onclick="submitx(this,'form')"/>
<@xy.button type="return_bottom" onclick="shutCors()"/>
</@xy.content_submit>
</@xy.form>
<@xy.foot_script >
<@xy.script src="js/jquery-ui-1.10.4.min.js"/>
</@xy.foot_script>
<script type="text/javascript">
    function submitx(obj, formid) {
        hold(obj, function (returnValue) {
            popupOk(returnValue, function () {
                shutCors();
                getParentPop().refresh();
            })
        })
    }

    $(document).ready(function () {
        $(".sortable-list").sortable({
            connectWith: ".connectList"
        }).disableSelection();
    });
</script>
</@xy.content_body>
</@xy.page_content>
<@xy.page_footer>
</@xy.page_footer>
</@xy.container>
</@xy.html_body>
</@xy.html>

