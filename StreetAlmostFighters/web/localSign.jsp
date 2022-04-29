<%@page import="model.repositories.LocalMemo"%> <%@page
import="model.negocios.Place"%> <% String stringId = request.getParameter("id");
Place lo = null; if(stringId != null){ int id = Integer.parseInt(stringId); lo =
LocalMemo.getCurrentInstance().read(id); session.removeAttribute("lo"); } %>

<h1>Fight place resgistration</h1>
<form class="form" method="post" action="LocalServlet">
  <tr>
    <td>Nickname:</td>
    <td>
      <input type="text" name="nickname" <% if(lo!=null){
      out.println("value=\""+lo.getNickname()+"\"");} %> />
    </td>
  </tr>
  <tr>
    <td>Address:</td>
    <td>
      <input type="text" name="address" <% if(lo!=null)?
      "value=\""+lo.getAddress()+"\"":"" %> />
    </td>
  </tr>
  <tr>
    <td>capacity:</td>
    <td>
      <input type="text" name="capacity" <% if(lo!=null)?
      "value=\""+lo.getCapacity()+"\"":"" %> />
    </td>
  </tr>
  <tr>
    <td rowspan="2">
      <input type="submit" class="btn btn_primary" value = <%= (lo!=null)?
      "Update": "Register" %> />
    </td>
  </tr>
</form>
