

# CoreUserCreateUsersRequestUsersInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | **String** | Postal address |  [optional] |
|**alternatename** | **String** | The alternate name of the user |  [optional] |
|**auth** | **String** | Auth plugins include manual, ldap, etc |  [optional] |
|**calendartype** | **String** | Calendar type such as \&quot;gregorian\&quot;, must exist on server |  [optional] |
|**city** | **String** | Home city of the user |  [optional] |
|**country** | **String** | Home country code of the user, such as AU or CZ |  [optional] |
|**createpassword** | **Boolean** | True if password should be created and mailed to user. |  [optional] |
|**customfields** | [**List&lt;CoreUserCreateUsersRequestUsersInnerCustomfieldsInner&gt;**](CoreUserCreateUsersRequestUsersInnerCustomfieldsInner.md) |  |  [optional] |
|**department** | **String** | department |  [optional] |
|**description** | **String** | User profile description, no HTML |  [optional] |
|**email** | **String** | A valid and unique email address |  [optional] |
|**firstname** | **String** | The first name(s) of the user |  [optional] |
|**firstnamephonetic** | **String** | The first name(s) phonetically of the user |  [optional] |
|**idnumber** | **String** | An arbitrary ID code number perhaps from the institution |  [optional] |
|**institution** | **String** | institution |  [optional] |
|**interests** | **String** | User interests (separated by commas) |  [optional] |
|**lang** | **String** | Language code such as \&quot;en\&quot;, must exist on server |  [optional] |
|**lastname** | **String** | The family name of the user |  [optional] |
|**lastnamephonetic** | **String** | The family name phonetically of the user |  [optional] |
|**maildisplay** | **Integer** | Email visibility |  [optional] |
|**mailformat** | **Integer** | Mail format code is 0 for plain text, 1 for HTML etc |  [optional] |
|**middlename** | **String** | The middle name of the user |  [optional] |
|**password** | **String** | Plain text password consisting of any characters |  [optional] |
|**phone1** | **String** | Phone 1 |  [optional] |
|**phone2** | **String** | Phone 2 |  [optional] |
|**preferences** | [**List&lt;CoreUserCreateUsersRequestUsersInnerPreferencesInner&gt;**](CoreUserCreateUsersRequestUsersInnerPreferencesInner.md) |  |  [optional] |
|**theme** | **String** | Theme name such as \&quot;standard\&quot;, must exist on server |  [optional] |
|**timezone** | **String** | Timezone code such as Australia/Perth, or 99 for default |  [optional] |
|**username** | **String** | Username policy is defined in Moodle security config. |  [optional] |


