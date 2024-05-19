# BlockIomadCompanyAdminCreateLicensesRequestLicensesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Allocation** | Pointer to **int32** | Number of license slots | [optional] [default to null]
**Clearonexpire** | Pointer to **int32** | Clear license assignments on expire - 0 &#x3D; no, 1 &#x3D; yes | [optional] [default to null]
**Companyid** | Pointer to **int32** | Company id | [optional] [default to null]
**Courses** | Pointer to [**[]BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner**](BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner.md) |  | [optional] 
**Cutoffdate** | Pointer to **int32** | License cut off date (int &#x3D; timestamp) | [optional] [default to null]
**Expirydate** | Pointer to **int32** | License expiry date (int &#x3D; timestamp) | [optional] [default to null]
**Instant** | Pointer to **int32** | Instant access - 0 &#x3D; no, 1 &#x3D; yes | [optional] [default to null]
**Name** | Pointer to **string** | License name | [optional] [default to "null"]
**Parentid** | Pointer to **int32** | Parent license id | [optional] [default to null]
**Program** | Pointer to **int32** | Program pf courses 0 &#x3D; no, 1 &#x3D; yes | [optional] [default to null]
**Reference** | Pointer to **string** | License reference | [optional] [default to "null"]
**Startdate** | Pointer to **int32** | Date from which the liucense is available (int &#x3D; timestamp)  | [optional] [default to null]
**Type** | Pointer to **int32** | License type - 0 &#x3D; standard, 1 &#x3D; reusable, 2 &#x3D; standard educator, 3 &#x3D; reusable educator | [optional] [default to null]
**Used** | Pointer to **int32** | Number how often the lic can be allocated | [optional] [default to null]
**Validlength** | Pointer to **int32** | Course access length (days) | [optional] [default to null]

## Methods

### NewBlockIomadCompanyAdminCreateLicensesRequestLicensesInner

`func NewBlockIomadCompanyAdminCreateLicensesRequestLicensesInner() *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner`

NewBlockIomadCompanyAdminCreateLicensesRequestLicensesInner instantiates a new BlockIomadCompanyAdminCreateLicensesRequestLicensesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBlockIomadCompanyAdminCreateLicensesRequestLicensesInnerWithDefaults

`func NewBlockIomadCompanyAdminCreateLicensesRequestLicensesInnerWithDefaults() *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner`

NewBlockIomadCompanyAdminCreateLicensesRequestLicensesInnerWithDefaults instantiates a new BlockIomadCompanyAdminCreateLicensesRequestLicensesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAllocation

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetAllocation() int32`

GetAllocation returns the Allocation field if non-nil, zero value otherwise.

### GetAllocationOk

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetAllocationOk() (*int32, bool)`

GetAllocationOk returns a tuple with the Allocation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllocation

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) SetAllocation(v int32)`

SetAllocation sets Allocation field to given value.

### HasAllocation

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) HasAllocation() bool`

HasAllocation returns a boolean if a field has been set.

### GetClearonexpire

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetClearonexpire() int32`

GetClearonexpire returns the Clearonexpire field if non-nil, zero value otherwise.

### GetClearonexpireOk

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetClearonexpireOk() (*int32, bool)`

GetClearonexpireOk returns a tuple with the Clearonexpire field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClearonexpire

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) SetClearonexpire(v int32)`

SetClearonexpire sets Clearonexpire field to given value.

### HasClearonexpire

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) HasClearonexpire() bool`

HasClearonexpire returns a boolean if a field has been set.

### GetCompanyid

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetCompanyid() int32`

GetCompanyid returns the Companyid field if non-nil, zero value otherwise.

### GetCompanyidOk

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetCompanyidOk() (*int32, bool)`

GetCompanyidOk returns a tuple with the Companyid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompanyid

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) SetCompanyid(v int32)`

SetCompanyid sets Companyid field to given value.

### HasCompanyid

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) HasCompanyid() bool`

HasCompanyid returns a boolean if a field has been set.

### GetCourses

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetCourses() []BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner`

GetCourses returns the Courses field if non-nil, zero value otherwise.

### GetCoursesOk

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetCoursesOk() (*[]BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner, bool)`

GetCoursesOk returns a tuple with the Courses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourses

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) SetCourses(v []BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner)`

SetCourses sets Courses field to given value.

### HasCourses

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) HasCourses() bool`

HasCourses returns a boolean if a field has been set.

### GetCutoffdate

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetCutoffdate() int32`

GetCutoffdate returns the Cutoffdate field if non-nil, zero value otherwise.

### GetCutoffdateOk

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetCutoffdateOk() (*int32, bool)`

GetCutoffdateOk returns a tuple with the Cutoffdate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCutoffdate

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) SetCutoffdate(v int32)`

SetCutoffdate sets Cutoffdate field to given value.

### HasCutoffdate

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) HasCutoffdate() bool`

HasCutoffdate returns a boolean if a field has been set.

### GetExpirydate

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetExpirydate() int32`

GetExpirydate returns the Expirydate field if non-nil, zero value otherwise.

### GetExpirydateOk

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetExpirydateOk() (*int32, bool)`

GetExpirydateOk returns a tuple with the Expirydate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpirydate

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) SetExpirydate(v int32)`

SetExpirydate sets Expirydate field to given value.

### HasExpirydate

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) HasExpirydate() bool`

HasExpirydate returns a boolean if a field has been set.

### GetInstant

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetInstant() int32`

GetInstant returns the Instant field if non-nil, zero value otherwise.

### GetInstantOk

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetInstantOk() (*int32, bool)`

GetInstantOk returns a tuple with the Instant field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstant

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) SetInstant(v int32)`

SetInstant sets Instant field to given value.

### HasInstant

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) HasInstant() bool`

HasInstant returns a boolean if a field has been set.

### GetName

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetParentid

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetParentid() int32`

GetParentid returns the Parentid field if non-nil, zero value otherwise.

### GetParentidOk

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetParentidOk() (*int32, bool)`

GetParentidOk returns a tuple with the Parentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentid

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) SetParentid(v int32)`

SetParentid sets Parentid field to given value.

### HasParentid

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) HasParentid() bool`

HasParentid returns a boolean if a field has been set.

### GetProgram

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetProgram() int32`

GetProgram returns the Program field if non-nil, zero value otherwise.

### GetProgramOk

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetProgramOk() (*int32, bool)`

GetProgramOk returns a tuple with the Program field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProgram

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) SetProgram(v int32)`

SetProgram sets Program field to given value.

### HasProgram

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) HasProgram() bool`

HasProgram returns a boolean if a field has been set.

### GetReference

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetReference() string`

GetReference returns the Reference field if non-nil, zero value otherwise.

### GetReferenceOk

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetReferenceOk() (*string, bool)`

GetReferenceOk returns a tuple with the Reference field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReference

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) SetReference(v string)`

SetReference sets Reference field to given value.

### HasReference

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) HasReference() bool`

HasReference returns a boolean if a field has been set.

### GetStartdate

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetStartdate() int32`

GetStartdate returns the Startdate field if non-nil, zero value otherwise.

### GetStartdateOk

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetStartdateOk() (*int32, bool)`

GetStartdateOk returns a tuple with the Startdate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartdate

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) SetStartdate(v int32)`

SetStartdate sets Startdate field to given value.

### HasStartdate

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) HasStartdate() bool`

HasStartdate returns a boolean if a field has been set.

### GetType

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetType() int32`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetTypeOk() (*int32, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) SetType(v int32)`

SetType sets Type field to given value.

### HasType

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) HasType() bool`

HasType returns a boolean if a field has been set.

### GetUsed

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetUsed() int32`

GetUsed returns the Used field if non-nil, zero value otherwise.

### GetUsedOk

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetUsedOk() (*int32, bool)`

GetUsedOk returns a tuple with the Used field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsed

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) SetUsed(v int32)`

SetUsed sets Used field to given value.

### HasUsed

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) HasUsed() bool`

HasUsed returns a boolean if a field has been set.

### GetValidlength

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetValidlength() int32`

GetValidlength returns the Validlength field if non-nil, zero value otherwise.

### GetValidlengthOk

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) GetValidlengthOk() (*int32, bool)`

GetValidlengthOk returns a tuple with the Validlength field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidlength

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) SetValidlength(v int32)`

SetValidlength sets Validlength field to given value.

### HasValidlength

`func (o *BlockIomadCompanyAdminCreateLicensesRequestLicensesInner) HasValidlength() bool`

HasValidlength returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


