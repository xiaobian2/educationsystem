<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/26
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>课程表显示</title>
    <jsp:include page="../basic.jsp"></jsp:include>
    <script type="text/javascript">
        $(function(){
            $("#queryCourseTable").datagrid({
                url:"${pageContext.request.contextPath}/hobby/queryAll.controller",
                method:"post",
                rownumbers:true,
                striped:true,
                pagination:true,
                title:'课程表',
                fitColumns: true, //自适应列宽
                singleSelect: true,  //是否单选
                pageSize:5,
                pageList:[2,5,10],
                columns:[[

                {title:'一组',colspan:3},
                {field:'opt',title:'Operation',width:100,align:'center', rowspan:2,
                    formatter:function(value,rec){
                        return '<span style="color:red">Edit Delete</span>';
                    }
                },
                {title:'二组',colspan:3}
            ],[
                {field:'name',title:'Name',width:120,rowspan:1},
                {field:'addr',title:'Address',width:220,rowspan:1,sortable:true,
                    sorter:function(a,b){
                        return (a>b?1:-1);
                    }
                },
                {field:'col4',title:'Col41',width:150,rowspan:1},
                {field:'name1',title:'Name1',width:120,rowspan:1},
                {field:'addr1',title:'Address1',width:220,rowspan:1,sortable:true,
                    sorter:function(a,b){
                        return (a>b?1:-1);
                    }
                },
                {field:'col41',title:'Col411',width:150,rowspan:1}

                ]]


            });






        })






    </script>
</head>
<body>
<div>
    <table id="queryCourseTable"></table>
</div>
</body>
</html>
