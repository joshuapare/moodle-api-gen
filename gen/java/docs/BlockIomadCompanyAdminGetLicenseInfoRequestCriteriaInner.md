

# BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | the user column to search, expected keys (value format) are:                                 \&quot;id\&quot; (int) matching user id,                                 \&quot;name\&quot; (string) license name (Note: you can use % for searching but it may be considerably slower!),                                 \&quot;startdate\&quot; (int) license start date in unix time,                                 \&quot;expirydate\&quot; (int) license expiry date in unix time,                                 \&quot;companyid\&quot; (int) license company id,                                 \&quot;parentid\&quot;  (int) license parent id for split licenses,                                 \&quot;program\&quot;  (bool) license is program,                                 \&quot;instant\&quot;  (bool) license is instant,                                 \&quot;type\&quot;  (int) license type (0 &#x3D; standard, 1 &#x3D; reusable, 3 &#x3D; educator),                                 \&quot;reference\&quot; license reference (Note: you can use % for searching but it may be considerably slower!) |  [optional] |
|**value** | **String** | the value to search |  [optional] |


