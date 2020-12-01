<@xy.html>
<@xy.html_head value="主子表父表[kf_zzb_fb]管理">
</@xy.html_head>
<@xy.html_body>
<@xy.nav />
<@xy.container>
<@xy.page_content>
<@xy.content_title value="查看主子表父表[kf_zzb_fb]">
</@xy.content_title>
<@xy.content_body>
<@xy.form id="formx" >

<@xy.content_body type="edit">
        <@xy.insert label="单行文本框" value=kf_zzb_fb.danhwb position="edit"/>
        <@xy.insert label="多行文本框" value=kf_zzb_fb.duohwb position="edit"/>
        <@xy.insert label="下拉框" type="map" list=xlkData value=kf_zzb_fb.xlk position="edit"/>
        <@xy.insert label="下拉框多选" type="multiple" list=xlkdxData value=kf_zzb_fb.xlkdx position="edit"/>
        <@xy.insert label="单选按钮" type="map" list=dxkData value=kf_zzb_fb.dxk position="edit"/>
        <@xy.insert label="复选框" type="multiple" list=fxkData value=kf_zzb_fb.fxk position="edit"/>
        <@xy.insert label="日期" value=kf_zzb_fb.rq type="calendar" position="edit"/>
        <@xy.insert label="日期时间" value=kf_zzb_fb.rqsj type="calendar" position="edit"/>
        <@xy.insert label="用户" value=kf_zzb_fb.yhmc position="edit"/>
        <@xy.insert label="机构" value=kf_zzb_fb.jgmc position="edit"/>
        <@xy.insert label="区域" type="code" lbbs="XZQY" value=kf_zzb_fb.qy position="edit"/>
        <@xy.insert label="区域多选" type="code_multiple" lbbs="XZQY" list=qydxData value=kf_zzb_fb.qydx position="edit"/>
        <@xy.download label="图片" type="img" value=kf_zzb_fb.tp id=kf_zzb_fb.tp position="search" position="edit"/>
       <@xy.download label="附件" value=kf_zzb_fb.fj id=kf_zzb_fb.fj position="search" position="edit"/>
</@xy.content_body>
<!-- 子表开始 -->
<@xy.content_title value="查看kf_zzb_zba子表信息">
</@xy.content_title>
<@xy.content_body>
<div class="grid">
    <div class="thead">
        <ul>
        <li style="width: 10%">单行文本框</li>
        <li style="width: 10%">多行文本框</li>
        <li style="width: 10%">下拉框</li>
        <li style="width: 10%">下拉框多选</li>
        <li style="width: 15%">单选按钮</li>
        <li style="width: 15%">复选框</li>
        <li style="width: 10%">日期</li>
    </ul>
    </div>
    <div class="tbody">
<#list listKf_zzb_zba as kf_zzb_zba>
    <ul>
        <li style="width: 10%"><@xy.insert value=kf_zzb_zba.danhwb/></li>
        <li style="width: 10%"><@xy.insert value=kf_zzb_zba.duohwb/></li>
        <li style="width: 10%"><@xy.insert type="map" list=xlkData value=kf_zzb_zba.xlk/></li>
        <li style="width: 10%"><@xy.insert type="multiple" list=xlkdxData value=kf_zzb_zba.xlkdx/></li>
        <li style="width: 15%"><@xy.insert type="map" list=dxkData value=kf_zzb_zba.dxk/></li>
        <li style="width: 15%"><@xy.insert type="multiple" list=fxkData value=kf_zzb_zba.fxk/></li>
        <li style="width: 10%"><@xy.insert value=kf_zzb_zba.rq type="calendar"/></li>
    </ul>
</#list>
    </div>
    </div>
</@xy.content_body>
<@xy.content_title value="查看kf_zzb_zbb子表信息">
</@xy.content_title>
<@xy.content_body>
<div class="grid">
    <div class="thead">
        <ul>
        <li style="width: 10%">日期时间</li>
        <li style="width: 10%">用户</li>
        <li style="width: 10%">机构</li>
        <li style="width: 10%">区域</li>
        <li style="width: 15%">区域多选</li>
        <li style="width: 12%">图片</li>
        <li style="width: 12%">附件</li>
    </ul>
    </div>
    <div class="tbody">
<#list listKf_zzb_zbb as kf_zzb_zbb>
    <ul>
        <li style="width: 10%"><@xy.insert value=kf_zzb_zbb.rqsj type="calendar"/></li>
        <li style="width: 10%"><@xy.insert value=kf_zzb_zbb.yhmc /></li>
        <li style="width: 10%"><@xy.insert value=kf_zzb_zbb.jgmc /></li>
        <li style="width: 10%"><@xy.insert type="code" lbbs="XZQY" value=kf_zzb_zbb.qy/></li>
        <li style="width: 15%"><@xy.insert type="code_multiple" lbbs="XZQY" list=qydxData value=kf_zzb_zbb.qydx/></li>
        <li style="width: 12%"><@xy.download type="img" value=kf_zzb_zbb.tp id=kf_zzb_zbb.tp position="search"/></li>
        <li style="width: 12%"><@xy.download value=kf_zzb_zbb.fj id=kf_zzb_zbb.fj position="search"/></li>
    </ul>
</#list>
    </div>
    </div>
</@xy.content_body>
<!-- 子表结束 -->
<@xy.content_submit>
<@xy.button type="back_bottom" onclick="back('${ctx}/base/kfpt/kfyl/zzb')"/>
</@xy.content_submit>
</@xy.form>
<@xy.foot_script >
</@xy.foot_script>
<script type="text/javascript">
</script>
</@xy.content_body>
</@xy.page_content>
<@xy.page_footer>
</@xy.page_footer>
</@xy.container>
</@xy.html_body>
</@xy.html>

