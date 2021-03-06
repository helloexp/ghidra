/* ###
 * IP: GHIDRA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package agent.dbgmodel.jna.dbgmodel.debughost;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.platform.win32.Variant.VARIANT;
import com.sun.jna.platform.win32.WinDef.ULONGByReference;
import com.sun.jna.platform.win32.WinDef.ULONGLONGByReference;
import com.sun.jna.platform.win32.WinNT.HRESULT;

import agent.dbgmodel.jna.dbgmodel.DbgModelNative.LOCATION;

public class WrapIDebugHostField extends WrapIDebugHostBaseClass implements IDebugHostField {
	public static class ByReference extends WrapIDebugHostField implements Structure.ByReference {
	}

	public WrapIDebugHostField() {
	}

	public WrapIDebugHostField(Pointer pvInstance) {
		super(pvInstance);
	}

	@Override
	public HRESULT GetLocationKind(ULONGByReference locationKind) {
		return _invokeHR(VTIndicesX.GET_LOCATION_KIND, getPointer(), locationKind);
	}

	@Override
	public HRESULT GetOffset(ULONGLONGByReference offset) {
		return _invokeHR(VTIndicesX.GET_OFFSET, getPointer(), offset);
	}

	@Override
	public HRESULT GetLocation(LOCATION.ByReference location) {
		return _invokeHR(VTIndicesX.GET_LOCATION, getPointer(), location);
	}

	@Override
	public HRESULT GetValue(VARIANT.ByReference value) {
		return _invokeHR(VTIndicesX.GET_VALUE, getPointer(), value);
	}

}
