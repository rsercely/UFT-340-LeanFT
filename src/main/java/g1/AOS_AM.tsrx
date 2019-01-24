<?xml version="1.0" encoding="utf-8" standalone="yes"?>
<applicationModel>
    <name>Application Model</name>
    <className>AOS_AM</className>
    <objects>
        <object type="Button" technology="Web">
            <name>check_out_btn</name>
            <codeName>aCheckOutBtnButton</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="ButtonType" type="string" isRegExp="false">submit</property>
                    <property name="Name" type="string" isRegExp="false">CHECKOUT ($2,558.00)</property>
                    <property name="TagName" type="string" isRegExp="false">BUTTON</property>
                </properties>
            </identification>
        </object>
        <object type="EditField" technology="Web">
            <name>usernameInOrderPayment</name>
            <codeName>aUsernameInOrderPaymentEditField</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="Name" type="string" isRegExp="false">usernameInOrderPayment</property>
                    <property name="TagName" type="string" isRegExp="true">IN.*</property>
                    <property name="Type" type="string" isRegExp="false">text</property>
                </properties>
            </identification>
        </object>
        <object type="EditField" technology="Web">
            <name>passwordInOrderPayment</name>
            <codeName>aPasswordInOrderPaymentEditField</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="Name" type="string" isRegExp="false">passwordInOrderPayment</property>
                    <property name="TagName" type="string" isRegExp="false">INPUT</property>
                    <property name="Type" type="string" isRegExp="false">password</property>
                </properties>
            </identification>
        </object>
        <object type="Link" technology="Web">
            <name>SHOPPING CART</name>
            <codeName>aSHOPPINGCARTLink</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="InnerText" type="string" isRegExp="false">SHOPPING CART</property>
                    <property name="TagName" type="string" isRegExp="false">A</property>
                </properties>
            </identification>
        </object>
        <object type="WebElement" technology="Web">
            <name>REMOVE</name>
            <codeName>aREMOVEWebElement</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="InnerText" type="string" isRegExp="false">REMOVE</property>
                    <property name="TagName" type="string" isRegExp="false">A</property>
                </properties>
            </identification>
        </object>
        <object type="WebElement" technology="Web">
            <name>menuCart</name>
            <codeName>aMenuCartWebElement</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="AccessibilityName" type="string" isRegExp="false"></property>
                    <property name="Id" type="string" isRegExp="false">menuCart</property>
                    <property name="InnerText" type="string" isRegExp="false"></property>
                    <property name="TagName" type="string" isRegExp="false">svg</property>
                </properties>
            </identification>
        </object>
    </objects>
</applicationModel>
