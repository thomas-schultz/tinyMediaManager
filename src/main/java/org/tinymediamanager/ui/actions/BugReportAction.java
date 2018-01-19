/*
 * Copyright 2012 - 2017 Manuel Laggner
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.tinymediamanager.ui.actions;

import java.awt.event.ActionEvent;
import java.util.ResourceBundle;

import javax.swing.AbstractAction;
import javax.swing.JDialog;

import org.tinymediamanager.ui.IconManager;
import org.tinymediamanager.ui.MainWindow;
import org.tinymediamanager.ui.UTF8Control;
import org.tinymediamanager.ui.dialogs.BugReportDialog;

/**
 * The BugReportAction to send bug reports directly from tmm
 * 
 * @author Manuel Laggner
 */
public class BugReportAction extends AbstractAction {
  private static final long           serialVersionUID = 2468561945547768259L;
  private static final ResourceBundle BUNDLE           = ResourceBundle.getBundle("messages", new UTF8Control()); //$NON-NLS-1$

  public BugReportAction() {
    putValue(NAME, BUNDLE.getString("BugReport")); //$NON-NLS-1$
    putValue(SHORT_DESCRIPTION, BUNDLE.getString("BugReport")); //$NON-NLS-1$
    putValue(SMALL_ICON, IconManager.BUG);
    putValue(LARGE_ICON_KEY, IconManager.BUG);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    JDialog dialog = new BugReportDialog();
    dialog.setLocationRelativeTo(MainWindow.getActiveInstance());
    dialog.pack();
    dialog.setVisible(true);
  }
}
