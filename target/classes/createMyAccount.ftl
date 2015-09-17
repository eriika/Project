<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="es-ES">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>User signup</title>
        <link rel="stylesheet" href="main.css" type="text/css" media="screen" />
        </head>
    <body>
        <div class="wrapper">	
            <div class="section">
                <?php if(!isset($status)): ?>
                <h1 align=center>User signup</h1>
                <form id="form1" action="formulario_1.php" method="POST">

                    <label for="name">Name <span style="color: green"></span></label>
                    <input type=”text” tabindex="1" name="name" class="text">

                        <label for="username">Username</label>
                        <input type=”text” tabindex="2" name="username" class="text">

                            <label for="password1">Password</label>
                            <input type="password" tabindex="3" name="password1" class="text">

                                <label for="password2">Repeat password</label>
                                <input type="password" tabindex="4" name="password2" class="text">
                                    <div>
                                        <input tabindex="6" name="send" type="submit" class="submit" value="Create my account" class="submit"/>
                                        </div>

                                    </form>
                                    <?php else: ?>
                                            <!--h1>¡Formulario enviado con éxito!</h1-->

                                    <?php endif; ?>
                            </div> <!-- Cerramos div section -->
                    </div> <!-- Cerramos div wrapper -->
                                    </body>
   