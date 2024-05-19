# CoreCourseSearchCourses200ResponseCoursesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Categoryid** | Pointer to **int32** | category id | [optional] 
**Categoryname** | Pointer to **string** | category name | [optional] 
**Contacts** | Pointer to [**[]CoreCourseSearchCourses200ResponseCoursesInnerContactsInner**](CoreCourseSearchCourses200ResponseCoursesInnerContactsInner.md) |  | [optional] 
**Courseimage** | Pointer to **string** | Course image | [optional] 
**Customfields** | Pointer to [**[]CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner**](CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner.md) |  | [optional] 
**Displayname** | Pointer to **string** | course display name | [optional] 
**Enrollmentmethods** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Fullname** | Pointer to **string** | course full name | [optional] 
**Id** | Pointer to **int32** | course id | [optional] 
**Overviewfiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Shortname** | Pointer to **string** | course short name | [optional] 
**Showactivitydates** | Pointer to **bool** | Whether the activity dates are shown or not | [optional] 
**Showcompletionconditions** | Pointer to **bool** | Whether the activity completion conditions are shown or not | [optional] 
**Sortorder** | Pointer to **int32** | Sort order in the category | [optional] 
**Summary** | Pointer to **string** | summary | [optional] 
**Summaryfiles** | Pointer to [**[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner**](CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md) |  | [optional] 
**Summaryformat** | Pointer to **int32** | summary format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] 

## Methods

### NewCoreCourseSearchCourses200ResponseCoursesInner

`func NewCoreCourseSearchCourses200ResponseCoursesInner() *CoreCourseSearchCourses200ResponseCoursesInner`

NewCoreCourseSearchCourses200ResponseCoursesInner instantiates a new CoreCourseSearchCourses200ResponseCoursesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseSearchCourses200ResponseCoursesInnerWithDefaults

`func NewCoreCourseSearchCourses200ResponseCoursesInnerWithDefaults() *CoreCourseSearchCourses200ResponseCoursesInner`

NewCoreCourseSearchCourses200ResponseCoursesInnerWithDefaults instantiates a new CoreCourseSearchCourses200ResponseCoursesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCategoryid

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetCategoryid() int32`

GetCategoryid returns the Categoryid field if non-nil, zero value otherwise.

### GetCategoryidOk

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetCategoryidOk() (*int32, bool)`

GetCategoryidOk returns a tuple with the Categoryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryid

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) SetCategoryid(v int32)`

SetCategoryid sets Categoryid field to given value.

### HasCategoryid

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) HasCategoryid() bool`

HasCategoryid returns a boolean if a field has been set.

### GetCategoryname

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetCategoryname() string`

GetCategoryname returns the Categoryname field if non-nil, zero value otherwise.

### GetCategorynameOk

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetCategorynameOk() (*string, bool)`

GetCategorynameOk returns a tuple with the Categoryname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryname

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) SetCategoryname(v string)`

SetCategoryname sets Categoryname field to given value.

### HasCategoryname

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) HasCategoryname() bool`

HasCategoryname returns a boolean if a field has been set.

### GetContacts

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetContacts() []CoreCourseSearchCourses200ResponseCoursesInnerContactsInner`

GetContacts returns the Contacts field if non-nil, zero value otherwise.

### GetContactsOk

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetContactsOk() (*[]CoreCourseSearchCourses200ResponseCoursesInnerContactsInner, bool)`

GetContactsOk returns a tuple with the Contacts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContacts

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) SetContacts(v []CoreCourseSearchCourses200ResponseCoursesInnerContactsInner)`

SetContacts sets Contacts field to given value.

### HasContacts

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) HasContacts() bool`

HasContacts returns a boolean if a field has been set.

### GetCourseimage

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetCourseimage() string`

GetCourseimage returns the Courseimage field if non-nil, zero value otherwise.

### GetCourseimageOk

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetCourseimageOk() (*string, bool)`

GetCourseimageOk returns a tuple with the Courseimage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseimage

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) SetCourseimage(v string)`

SetCourseimage sets Courseimage field to given value.

### HasCourseimage

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) HasCourseimage() bool`

HasCourseimage returns a boolean if a field has been set.

### GetCustomfields

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetCustomfields() []CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner`

GetCustomfields returns the Customfields field if non-nil, zero value otherwise.

### GetCustomfieldsOk

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetCustomfieldsOk() (*[]CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner, bool)`

GetCustomfieldsOk returns a tuple with the Customfields field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomfields

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) SetCustomfields(v []CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner)`

SetCustomfields sets Customfields field to given value.

### HasCustomfields

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) HasCustomfields() bool`

HasCustomfields returns a boolean if a field has been set.

### GetDisplayname

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetDisplayname() string`

GetDisplayname returns the Displayname field if non-nil, zero value otherwise.

### GetDisplaynameOk

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetDisplaynameOk() (*string, bool)`

GetDisplaynameOk returns a tuple with the Displayname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayname

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) SetDisplayname(v string)`

SetDisplayname sets Displayname field to given value.

### HasDisplayname

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) HasDisplayname() bool`

HasDisplayname returns a boolean if a field has been set.

### GetEnrollmentmethods

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetEnrollmentmethods() []map[string]interface{}`

GetEnrollmentmethods returns the Enrollmentmethods field if non-nil, zero value otherwise.

### GetEnrollmentmethodsOk

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetEnrollmentmethodsOk() (*[]map[string]interface{}, bool)`

GetEnrollmentmethodsOk returns a tuple with the Enrollmentmethods field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnrollmentmethods

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) SetEnrollmentmethods(v []map[string]interface{})`

SetEnrollmentmethods sets Enrollmentmethods field to given value.

### HasEnrollmentmethods

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) HasEnrollmentmethods() bool`

HasEnrollmentmethods returns a boolean if a field has been set.

### GetFullname

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetFullname() string`

GetFullname returns the Fullname field if non-nil, zero value otherwise.

### GetFullnameOk

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetFullnameOk() (*string, bool)`

GetFullnameOk returns a tuple with the Fullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullname

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) SetFullname(v string)`

SetFullname sets Fullname field to given value.

### HasFullname

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) HasFullname() bool`

HasFullname returns a boolean if a field has been set.

### GetId

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetOverviewfiles

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetOverviewfiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetOverviewfiles returns the Overviewfiles field if non-nil, zero value otherwise.

### GetOverviewfilesOk

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetOverviewfilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetOverviewfilesOk returns a tuple with the Overviewfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOverviewfiles

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) SetOverviewfiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetOverviewfiles sets Overviewfiles field to given value.

### HasOverviewfiles

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) HasOverviewfiles() bool`

HasOverviewfiles returns a boolean if a field has been set.

### GetShortname

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetShortname() string`

GetShortname returns the Shortname field if non-nil, zero value otherwise.

### GetShortnameOk

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetShortnameOk() (*string, bool)`

GetShortnameOk returns a tuple with the Shortname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShortname

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) SetShortname(v string)`

SetShortname sets Shortname field to given value.

### HasShortname

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) HasShortname() bool`

HasShortname returns a boolean if a field has been set.

### GetShowactivitydates

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetShowactivitydates() bool`

GetShowactivitydates returns the Showactivitydates field if non-nil, zero value otherwise.

### GetShowactivitydatesOk

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetShowactivitydatesOk() (*bool, bool)`

GetShowactivitydatesOk returns a tuple with the Showactivitydates field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowactivitydates

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) SetShowactivitydates(v bool)`

SetShowactivitydates sets Showactivitydates field to given value.

### HasShowactivitydates

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) HasShowactivitydates() bool`

HasShowactivitydates returns a boolean if a field has been set.

### GetShowcompletionconditions

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetShowcompletionconditions() bool`

GetShowcompletionconditions returns the Showcompletionconditions field if non-nil, zero value otherwise.

### GetShowcompletionconditionsOk

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetShowcompletionconditionsOk() (*bool, bool)`

GetShowcompletionconditionsOk returns a tuple with the Showcompletionconditions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowcompletionconditions

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) SetShowcompletionconditions(v bool)`

SetShowcompletionconditions sets Showcompletionconditions field to given value.

### HasShowcompletionconditions

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) HasShowcompletionconditions() bool`

HasShowcompletionconditions returns a boolean if a field has been set.

### GetSortorder

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetSortorder() int32`

GetSortorder returns the Sortorder field if non-nil, zero value otherwise.

### GetSortorderOk

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetSortorderOk() (*int32, bool)`

GetSortorderOk returns a tuple with the Sortorder field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortorder

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) SetSortorder(v int32)`

SetSortorder sets Sortorder field to given value.

### HasSortorder

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) HasSortorder() bool`

HasSortorder returns a boolean if a field has been set.

### GetSummary

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetSummary() string`

GetSummary returns the Summary field if non-nil, zero value otherwise.

### GetSummaryOk

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetSummaryOk() (*string, bool)`

GetSummaryOk returns a tuple with the Summary field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSummary

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) SetSummary(v string)`

SetSummary sets Summary field to given value.

### HasSummary

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) HasSummary() bool`

HasSummary returns a boolean if a field has been set.

### GetSummaryfiles

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetSummaryfiles() []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner`

GetSummaryfiles returns the Summaryfiles field if non-nil, zero value otherwise.

### GetSummaryfilesOk

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetSummaryfilesOk() (*[]CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner, bool)`

GetSummaryfilesOk returns a tuple with the Summaryfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSummaryfiles

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) SetSummaryfiles(v []CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner)`

SetSummaryfiles sets Summaryfiles field to given value.

### HasSummaryfiles

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) HasSummaryfiles() bool`

HasSummaryfiles returns a boolean if a field has been set.

### GetSummaryformat

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetSummaryformat() int32`

GetSummaryformat returns the Summaryformat field if non-nil, zero value otherwise.

### GetSummaryformatOk

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) GetSummaryformatOk() (*int32, bool)`

GetSummaryformatOk returns a tuple with the Summaryformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSummaryformat

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) SetSummaryformat(v int32)`

SetSummaryformat sets Summaryformat field to given value.

### HasSummaryformat

`func (o *CoreCourseSearchCourses200ResponseCoursesInner) HasSummaryformat() bool`

HasSummaryformat returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


