<@xy.html>
<@xy.html_head value="按钮增删查改[kf_anzscg]管理">
</@xy.html_head>
<@xy.html_body>
<@xy.nav/>
<@xy.container>
<@xy.form id="formx" position="search">
<@xy.page_head>
<@xy.page_head_top>
<ul class="packagelist">
<#list listKf_anzscg as kf_anzscg>
    <li>
        <div class="package-thumb" name="${table_code.id}">
            <div class="package-thumb-body" onclick="selectFxdy(this,'${table_code.id}');">
                <input value="${table_code.id}" id="${table_code.id}" type="hidden"/>
                <span class="statbody">
                        <@xy.insert value=kf_anzscg.mc/>
                </span>
            </div>
            <div class="package-thumb-tool">
                <div class="btn-group">
                    <button class="btn btn-action hover-initialized" data-toggle="dropdown" data-hover="dropdown"><i class="iconfont icon-diandian"></i>
                    </button>
                    <ul class="dropdown-menu pull-right animated fadeInDown">
                        <li>
                            <@xy.a onclick="forward(this,{'queryCriteria':false});" url="${ctx}/base/kfpt/kfyl/anzscg/editKf_anzscg" parameters="{'id':'${kf_anzscg.id}'}" text="编辑"/>
                        </li>
                        <li>
                            <@xy.a onclick="confirmRefresh(this,CONFIRM_TITLE_DELETE);" url="${ctx}/base/kfpt/kfyl/anzscg/deleteKf_anzscg" parameters="{'id':'${kf_anzscg.id}'}" text="删除"/>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </li>
</#list>
<li>
    <a onclick="forward(this,{'queryCriteria':false});" url="${ctx}/base/kfpt/kfyl/anzscg/addKf_anzscg" class="btn btn-light"><i class="iconfont icon-zengjia9"></i></a>
</li>
</ul>
</@xy.page_head_top>
</@xy.page_head>
<@xy.page_content>
<@xy.content_body>
<@xy.foot_script >
</@xy.foot_script>
<@xy.page_footer>
</@xy.page_footer>
</@xy.content_body>
</@xy.page_content>
</@xy.form>
</@xy.container>
</@xy.html_body>
</@xy.html>
