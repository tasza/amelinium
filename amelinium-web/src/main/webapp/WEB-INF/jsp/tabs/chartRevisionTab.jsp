<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<b><i><c:out value="${project.name}"/> Chart - Revision <c:out value="${snapshot.chartSnapshot.revision}"/></i></b></br>
	<pre><c:out value="${snapshot.chartSnapshot.wikiMarkupContent}" escapeXml="false" /></pre>