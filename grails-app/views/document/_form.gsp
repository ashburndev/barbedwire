<%@ page import="barbedwire.Document" %>



<div class="fieldcontain ${hasErrors(bean: documentInstance, field: 'comments', 'error')} ">
	<label for="comments">
		<g:message code="document.comments.label" default="Comments" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${documentInstance?.comments?}" var="c">
    <li><g:link controller="comment" action="show" id="${c.id}">${c?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="comment" action="create" params="['document.id': documentInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'comment.label', default: 'Comment')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: documentInstance, field: 'summary', 'error')} required">
	<label for="summary">
		<g:message code="document.summary.label" default="Summary" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="summary" required="" value="${documentInstance?.summary}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: documentInstance, field: 'title', 'error')} required">
	<label for="title">
		<g:message code="document.title.label" default="Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="title" required="" value="${documentInstance?.title}"/>

</div>

