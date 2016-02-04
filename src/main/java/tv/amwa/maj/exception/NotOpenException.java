/*
 * Copyright 2016 Advanced Media Workflow Assocation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * $Log: NotOpenException.java,v $
 * Revision 1.2  2007/11/27 20:38:00  vizigoth
 * Edited javadoc comments to release standard.
 *
 * Revision 1.1  2007/11/13 22:09:57  vizigoth
 * Public release of MAJ API.
 */

package tv.amwa.maj.exception;

// References: AAFFile, RandomFile

/** 
 * <p>Thrown when an operation on a file cannot take place because the file is
 * not in an opened state.</p>
 *
 * <p>Equivalent C result code: <code>AAFRESULT_NOT_OPEN 0x80120029</code></p>
 * 
 *
 *
 */
public class NotOpenException 
	extends Exception 
	implements MAJException {

	/** <p></p> */
	private static final long serialVersionUID = 1694842260517578714L;

	/**
	 * <p>Create a new not open exception with the given descriptive message.</p>
	 * 
	 * @param msg Message describing the exception.
	 */
	public NotOpenException(
			String msg) {
		
		super(msg);
	}
	
	/**
	 * <p>Create a new not open exception with no message.</p>
	 */
	public NotOpenException() {
		super();
	}
}
