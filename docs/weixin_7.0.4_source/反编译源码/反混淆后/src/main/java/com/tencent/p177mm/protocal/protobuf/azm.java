package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.azm */
public final class azm extends bsr {
    public String csB;
    public azh wDv;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(10218);
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseRequest != null) {
                c6093a.mo13479iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(c6093a);
            }
            if (this.csB != null) {
                c6093a.mo13475e(10, this.csB);
            }
            if (this.wDv != null) {
                c6093a.mo13479iy(20, this.wDv.computeSize());
                this.wDv.writeFields(c6093a);
            }
            AppMethodBeat.m2505o(10218);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = C6087a.m9557ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.csB != null) {
                ix += C6091a.m9575f(10, this.csB);
            }
            if (this.wDv != null) {
                ix += C6087a.m9557ix(20, this.wDv.computeSize());
            }
            AppMethodBeat.m2505o(10218);
            return ix;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(10218);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            azm azm = (azm) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            byte[] bArr;
            C6086a c6086a3;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        C7267hl c7267hl = new C7267hl();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = c7267hl.populateBuilderWithField(c6086a3, c7267hl, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        azm.BaseRequest = c7267hl;
                    }
                    AppMethodBeat.m2505o(10218);
                    return 0;
                case 10:
                    azm.csB = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(10218);
                    return 0;
                case 20:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        azh azh = new azh();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = azh.populateBuilderWithField(c6086a3, azh, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        azm.wDv = azh;
                    }
                    AppMethodBeat.m2505o(10218);
                    return 0;
                default:
                    AppMethodBeat.m2505o(10218);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(10218);
            return -1;
        }
    }
}
