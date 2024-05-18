

# CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | **String** | Postal address |  [optional] |
|**auth** | **String** | Auth plugins include manual, ldap, etc |  [optional] |
|**calendartype** | **String** | Calendar type such as \&quot;gregorian\&quot;, must exist on server |  [optional] |
|**city** | **String** | Home city of the user |  [optional] |
|**confirmed** | **Boolean** | Active user: 1 if confirmed, 0 otherwise |  [optional] |
|**country** | **String** | Home country code of the user, such as AU or CZ |  [optional] |
|**customfields** | [**List&lt;CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner&gt;**](CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner.md) |  |  [optional] |
|**department** | **String** | department |  [optional] |
|**description** | **String** | User profile description |  [optional] |
|**descriptionformat** | **Integer** | int format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) |  [optional] |
|**email** | **String** | An email address - allow email as root@localhost |  [optional] |
|**firstaccess** | **Integer** | first access to the site (0 if never) |  [optional] |
|**firstname** | **String** | The first name(s) of the user |  [optional] |
|**fullname** | **String** | The fullname of the user |  [optional] |
|**id** | **Integer** | ID of the user |  [optional] |
|**idnumber** | **String** | An arbitrary ID code number perhaps from the institution |  [optional] |
|**institution** | **String** | institution |  [optional] |
|**interests** | **String** | user interests (separated by commas) |  [optional] |
|**lang** | **String** | Language code such as \&quot;en\&quot;, must exist on server |  [optional] |
|**lastaccess** | **Integer** | last access to the site (0 if never) |  [optional] |
|**lastname** | **String** | The family name of the user |  [optional] |
|**mailformat** | **Integer** | Mail format code is 0 for plain text, 1 for HTML etc |  [optional] |
|**phone1** | **String** | Phone 1 |  [optional] |
|**phone2** | **String** | Phone 2 |  [optional] |
|**preferences** | [**List&lt;CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerPreferencesInner&gt;**](CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerPreferencesInner.md) |  |  [optional] |
|**profileimageurl** | **String** | User image profile URL - big version |  [optional] |
|**profileimageurlsmall** | **String** | User image profile URL - small version |  [optional] |
|**suspended** | **Boolean** | Suspend user account, either false to enable user login or true to disable it |  [optional] |
|**theme** | **String** | Theme name such as \&quot;standard\&quot;, must exist on server |  [optional] |
|**timezone** | **String** | Timezone code such as Australia/Perth, or 99 for default |  [optional] |
|**username** | **String** | The username |  [optional] |



