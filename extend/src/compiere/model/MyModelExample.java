/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/

package compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.PO;
import org.compiere.model.POInfo;

/**
 * This is a non-working example of a Persistent Business Object. 
 * You would extend the class generated by GenerateModel.java
 * 
 * @author Jorg Janke
 * @version $Id: MyModelExample.java,v 1.2 2006/07/30 00:51:57 jjanke Exp $
 */
public class MyModelExample extends PO {

  private static final long serialVersionUID = -7122834919952485992L;

  /**
   * Standard constructor. You must implement this constructor for Adempiere Persistency
   * 
   * @param ctx
   *          context
   * @param id
   *          the primary key ID
   * @param trxName
   *          transaction
   */
  public MyModelExample(Properties ctx, int id, String trxName) {
    super(ctx, id, trxName);
  } // MyModelExample

  /**
   * Optional Load Constructor. You would use this constructor to load several business objects. 
   * <code>
   *   SELECT * FROM MyModelExample WHERE ...
   *  </code>
   * 
   * @param ctx
   *          context
   * @param rs
   *          result set
   * @param trxName
   *          transaction
   */
  public MyModelExample(Properties ctx, ResultSet rs, String trxName) {
    super(ctx, rs, trxName);
  } // MyModelExample

  /**
   * Init Persistent Object. You would NOT create this method as it is created 
   * by the persistency class generated by GenerateModel.java
   * 
   * @param ctx
   *          context
   * @return PO information
   */
  @Override
  protected POInfo initPO(Properties ctx) {
    return null;
  } // initPO

  /**
   * Get Access Level.
   * 
   * @return access level
   */
  protected int get_AccessLevel() {
    return 0;
  } // get_AccessLevel

} // MyModelExample
