<%@ page import="barbedwire.Comment" %>



<div class="fieldcontain ${hasErrors(bean: commentInstance, field: 'body', 'error')} required">
	<label for="body">
		<g:message code="comment.body.label" default="Body" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="body" required="" value="${commentInstance?.body}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: commentInstance, field: 'document', 'error')} required">
	<label for="document">
		<g:message code="comment.document.label" default="Document" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="document" name="document.id" from="${barbedwire.Document.list()}" optionKey="id" required="" value="${commentInstance?.document?.id}" class="many-to-one"/>

</div>

