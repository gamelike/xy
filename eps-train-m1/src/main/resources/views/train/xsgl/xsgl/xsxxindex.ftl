<@xy.html>
    <@xy.html_head value="学生信息管理">
    </@xy.html_head>
    <@xy.html_body>
        <@xy.nav/>
        <@xy.form id="autoForm" position="search">
            <@xy.container>
                <@xy.page_head value="树" value_note="学生信息">
                    <!-- 主页查询 开始 -->
                    <@xy.page_head_top>
                        <@xy.text label="姓名" value="${queryVo.likeItem['xm']}" name="likeItem[xm]"
                        id="xm" position="search"/>
                        <@xy.calendar label="出生日期" value="${queryVo.equalItem['csrq']}" name="equalItem[csrq]"
                        id="csrq" time=false position="search"/>
                        <@xy.text value="${queryVo.equalItem['njbh']}" name="equalItem[njbh]"
                        id="id" position="search" type="hidden"/>
                        <@xy.text value=njbh name="njbh"  id="njbh" type="hidden"/>
                    </@xy.page_head_top>
                    <!-- 主页查询 结束 -->
                    <!-- 更多查询 开始 -->
                    <@xy.page_head_more>
                    </@xy.page_head_more>
                    <!-- 更多查询 结束 -->
                    <@xy.searchButton id="search" />
                </@xy.page_head>
                <@xy.page_content>
                    <@xy.content_title value="学生信息">
                        <@xy.button type="add" onclick="return checkval('${njbh}',this);" url="${ctx}/train/xsgl/xsgl/addStudent_detail" parameters="{'njbh':'${njbh}'}"/>
                    </@xy.content_title>
                    <div class="layout">
                        <div class="col-lg-3">
                        <div class="layout-side">
                            <div class="sidebar">
                                <div class="sidebar-left">
                                    <h4>班级信息</h4>
                                </div>
                                <div class="sidebar-right"></div>
                            </div>
                            <div class="zTreeDemoBackground left">
                                <ul id="treeformTree" class="ztree"></ul>
                            </div>
                        </div>
                        </div>
                        <div class="col-lg-9">
                        <div class="grid" id="xsgl">
                            <div class="thead">
                                <ul>
                                    <li style="width:10%">序号</li>
                                    <li style="width:10%">姓名</li>
                                    <li style="width:10%">学号</li>
                                    <li style="width:10%">性别</li>
                                    <li style="width:10%">出生日期</li>
                                    <li style="width:10%">入学日期</li>
                                    <li style="width:10%">操作</li>
                                </ul>
                            </div>
                            <div class="tbody">
                                <#list listStudent_detail as student_detail>
                                    <ul>
                                        <li style="width:10%"><span class="xsgl"></span></li>
                                        <li style="width:10%"><@xy.insert value=student_detail.xm/></li>
                                        <li style="width:10%"><@xy.insert value=student_detail.xh/></li>
                                        <li style="width:10%"><@xy.insert type="map" list=xbData value=student_detail.xb/></li>
                                        <li style="width:10%"><@xy.insert type="calendar" value=student_detail.csrq/></li>
                                        <li style="width:10%"><@xy.insert type="calendar" value=student_detail.rxrq/></li>
                                        <li style="width:10%">
                                            <@xy.button type="edit_line" onclick="forward(this);" url="${ctx}/train/xsgl/xsgl/editStudent_detail" parameters="{'id':'${student_detail.id}','njbh':'${njbh}'}" ignoretrt=true/>
                                            <@xy.button type="delete_line" onclick="confirmRefresh(this,CONFIRM_TITLE_DELETE);"
                                            url="${ctx}/train/xsgl/xsgl/deleteStudent_detail" parameters="{'id':'${student_detail.id}'}" text="删除" ignoretrt=true/>
                                        </li>
                                    </ul>
                                </#list>
                            </div>
                        </div>
                        </div>
                    </div>
                    <@xy.splittoolbar />
                </@xy.page_content>
                <@xy.foot_script >
                </@xy.foot_script>
                <script type="text/javascript">
                    $(function sortSxh(){
                        $("#xsgl").find("span[class='xsgl']").each(function (index) {
                            $(this).html(index+1);
                        });
                    })
                    var setting = {
                        data: {
                            simpleData: {
                                enable: true,
                                idKey: "id",
                                pIdKey: "pid",
                                addDiyDom: addSubstringDom
                            },
                            key: {
                                name: "bjmc",
                                id: "id"
                            }
                        },
                        callback: {
                            onClick: zTreeOnClick
                        }
                    };
                    var zNodes =${treeformTree};
                    $(document).ready(function () {
                        $.fn.zTree.init($("#treeformTree"), setting, zNodes);
                        // 显示选中的树节点
                        var treeObj = $.fn.zTree.getZTreeObj("treeformTree");
                        treeObj.expandAll(true);
                    });

                    function zTreeOnClick(event, treeId, treeNode) {
                        $("#id").val(treeNode.id);
                        $("#njbh").val(treeNode.id);
                        $("#search").click();
                    }

                    function checkval(id,obj){
                        if(id==null||id==''){
                            alert("请先点击左侧树节点！");
                            return false;
                        }else{
                            forward(obj);
                            return true;
                        }
                    }
                </script>
                <@xy.page_footer>
                </@xy.page_footer>
            </@xy.container>
        </@xy.form>
    </@xy.html_body>
</@xy.html>
