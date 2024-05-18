

# BlockIomadCompanyAdminCreateLicensesRequestLicensesInner

one or many licenses

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allocation** | **Integer** | Number of license slots |  [optional] |
|**clearonexpire** | **Integer** | Clear license assignments on expire - 0 &#x3D; no, 1 &#x3D; yes |  [optional] |
|**companyid** | **Integer** | Company id |  [optional] |
|**courses** | [**List&lt;BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner&gt;**](BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner.md) |  |  [optional] |
|**cutoffdate** | **Integer** | License cut off date (int &#x3D; timestamp) |  [optional] |
|**expirydate** | **Integer** | License expiry date (int &#x3D; timestamp) |  [optional] |
|**instant** | **Integer** | Instant access - 0 &#x3D; no, 1 &#x3D; yes |  [optional] |
|**name** | **String** | License name |  [optional] |
|**parentid** | **Integer** | Parent license id |  [optional] |
|**program** | **Integer** | Program pf courses 0 &#x3D; no, 1 &#x3D; yes |  [optional] |
|**reference** | **String** | License reference |  [optional] |
|**startdate** | **Integer** | Date from which the liucense is available (int &#x3D; timestamp)  |  [optional] |
|**type** | **Integer** | License type - 0 &#x3D; standard, 1 &#x3D; reusable, 2 &#x3D; standard educator, 3 &#x3D; reusable educator |  [optional] |
|**used** | **Integer** | Number how often the lic can be allocated |  [optional] |
|**validlength** | **Integer** | Course access length (days) |  [optional] |



