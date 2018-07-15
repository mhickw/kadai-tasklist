<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<label for="content">タスク名</label><br />
<input type="text" name="content" value="${tasks.content}" />
<br /><br />

<label for="deadline">締め切り</label><br />
<input type="text" name="deadlinet" value="${tasks.deadline}" />
<br /><br />

<input type="hidden" name="_token" value="${_token}" />
<button type="submit">投稿</button>