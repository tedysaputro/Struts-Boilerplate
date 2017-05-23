<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Please Sign In</h3>
                    </div>
                    <div class="panel-body">
                        <s:form action="loginSubmit">
                            <fieldset>
                                <div class="form-group">
                                	<s:textfield id="email" cssClass="form-control" name="email" type="email" placeholder="E-mail" />
                                </div>
                                <div class="form-group">
                                	<s:textfield id="password" cssClass="form-control" name="password" type="password" placeholder="Password" />
                                </div>
<!--                                 <div class="form-group"> -->
<!--                                     <input class="form-control" placeholder="Password" name="password" type="password" value=""> -->
<!--                                 </div> -->
<!--                                 <div class="checkbox"> -->
<!--                                     <label> -->
<!--                                         <input name="remember" type="checkbox" value="Remember Me">Remember Me -->
<!--                                     </label> -->
<!--                                 </div> -->
<!--                                 Change this to a button or input when using this as a form -->
<!--                                 <a href="index.html" class="btn btn-lg btn-success btn-block">Login</a> -->
                            </fieldset>
                      </s:form>
                    </div>
                </div>
            </div>
        </div>
    </div>
<%-- <s:actionerror /> --%>
<!-- 	<h3>Login</h3> -->
<%-- 	<s:form action="login"> --%>
<%--     	<s:textfield label="User Name" key="userName"/> --%>
<%--     	<s:textfield label="Password" key="password"/> --%>
<%--     	<s:submit/> --%>
<%-- 	</s:form> --%>
<!-- </div> -->


