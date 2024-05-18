# BlockIomadCompanyAdminEditLicensesRequestLicensesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Allocation** | Pointer to **int32** | Number of license slots | [optional] 
**Companyid** | Pointer to **int32** | Company id | [optional] 
**Courses** | Pointer to [**[]BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner**](BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner.md) |  | [optional] 
**Expirydate** | Pointer to **int32** | License expiry date | [optional] [default to null]
**Id** | Pointer to **int32** | license ID | [optional] 
**Instant** | Pointer to **int32** | Instant access - 0 &#x3D; no, 1 &#x3D; yes | [optional] 
**Name** | Pointer to **string** | License name | [optional] 
**Parentid** | Pointer to **int32** | Parent license id | [optional] 
**Program** | Pointer to **int32** | Program pf courses 0 &#x3D; no, 1 &#x3D; yes | [optional] 
**Reference** | Pointer to **string** | License reference | [optional] 
**Type** | Pointer to **int32** | License type - 0 &#x3D; standard, 1 &#x3D; reusable, 2 &#x3D; standard educator, 3 &#x3D; reusable educator | [optional] 
**Used** | Pointer to **int32** | Number allocated | [optional] [default to null]
**Validlength** | Pointer to **int32** | Course access length (days) | [optional] 

## Methods

### NewBlockIomadCompanyAdminEditLicensesRequestLicensesInner

`func NewBlockIomadCompanyAdminEditLicensesRequestLicensesInner() *BlockIomadCompanyAdminEditLicensesRequestLicensesInner`

NewBlockIomadCompanyAdminEditLicensesRequestLicensesInner instantiates a new BlockIomadCompanyAdminEditLicensesRequestLicensesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBlockIomadCompanyAdminEditLicensesRequestLicensesInnerWithDefaults

`func NewBlockIomadCompanyAdminEditLicensesRequestLicensesInnerWithDefaults() *BlockIomadCompanyAdminEditLicensesRequestLicensesInner`

NewBlockIomadCompanyAdminEditLicensesRequestLicensesInnerWithDefaults instantiates a new BlockIomadCompanyAdminEditLicensesRequestLicensesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAllocation

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) GetAllocation() int32`

GetAllocation returns the Allocation field if non-nil, zero value otherwise.

### GetAllocationOk

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) GetAllocationOk() (*int32, bool)`

GetAllocationOk returns a tuple with the Allocation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllocation

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) SetAllocation(v int32)`

SetAllocation sets Allocation field to given value.

### HasAllocation

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) HasAllocation() bool`

HasAllocation returns a boolean if a field has been set.

### GetCompanyid

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) GetCompanyid() int32`

GetCompanyid returns the Companyid field if non-nil, zero value otherwise.

### GetCompanyidOk

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) GetCompanyidOk() (*int32, bool)`

GetCompanyidOk returns a tuple with the Companyid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompanyid

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) SetCompanyid(v int32)`

SetCompanyid sets Companyid field to given value.

### HasCompanyid

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) HasCompanyid() bool`

HasCompanyid returns a boolean if a field has been set.

### GetCourses

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) GetCourses() []BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner`

GetCourses returns the Courses field if non-nil, zero value otherwise.

### GetCoursesOk

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) GetCoursesOk() (*[]BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner, bool)`

GetCoursesOk returns a tuple with the Courses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourses

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) SetCourses(v []BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner)`

SetCourses sets Courses field to given value.

### HasCourses

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) HasCourses() bool`

HasCourses returns a boolean if a field has been set.

### GetExpirydate

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) GetExpirydate() int32`

GetExpirydate returns the Expirydate field if non-nil, zero value otherwise.

### GetExpirydateOk

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) GetExpirydateOk() (*int32, bool)`

GetExpirydateOk returns a tuple with the Expirydate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpirydate

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) SetExpirydate(v int32)`

SetExpirydate sets Expirydate field to given value.

### HasExpirydate

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) HasExpirydate() bool`

HasExpirydate returns a boolean if a field has been set.

### GetId

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetInstant

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) GetInstant() int32`

GetInstant returns the Instant field if non-nil, zero value otherwise.

### GetInstantOk

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) GetInstantOk() (*int32, bool)`

GetInstantOk returns a tuple with the Instant field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstant

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) SetInstant(v int32)`

SetInstant sets Instant field to given value.

### HasInstant

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) HasInstant() bool`

HasInstant returns a boolean if a field has been set.

### GetName

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetParentid

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) GetParentid() int32`

GetParentid returns the Parentid field if non-nil, zero value otherwise.

### GetParentidOk

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) GetParentidOk() (*int32, bool)`

GetParentidOk returns a tuple with the Parentid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentid

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) SetParentid(v int32)`

SetParentid sets Parentid field to given value.

### HasParentid

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) HasParentid() bool`

HasParentid returns a boolean if a field has been set.

### GetProgram

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) GetProgram() int32`

GetProgram returns the Program field if non-nil, zero value otherwise.

### GetProgramOk

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) GetProgramOk() (*int32, bool)`

GetProgramOk returns a tuple with the Program field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProgram

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) SetProgram(v int32)`

SetProgram sets Program field to given value.

### HasProgram

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) HasProgram() bool`

HasProgram returns a boolean if a field has been set.

### GetReference

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) GetReference() string`

GetReference returns the Reference field if non-nil, zero value otherwise.

### GetReferenceOk

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) GetReferenceOk() (*string, bool)`

GetReferenceOk returns a tuple with the Reference field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReference

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) SetReference(v string)`

SetReference sets Reference field to given value.

### HasReference

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) HasReference() bool`

HasReference returns a boolean if a field has been set.

### GetType

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) GetType() int32`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) GetTypeOk() (*int32, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) SetType(v int32)`

SetType sets Type field to given value.

### HasType

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) HasType() bool`

HasType returns a boolean if a field has been set.

### GetUsed

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) GetUsed() int32`

GetUsed returns the Used field if non-nil, zero value otherwise.

### GetUsedOk

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) GetUsedOk() (*int32, bool)`

GetUsedOk returns a tuple with the Used field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsed

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) SetUsed(v int32)`

SetUsed sets Used field to given value.

### HasUsed

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) HasUsed() bool`

HasUsed returns a boolean if a field has been set.

### GetValidlength

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) GetValidlength() int32`

GetValidlength returns the Validlength field if non-nil, zero value otherwise.

### GetValidlengthOk

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) GetValidlengthOk() (*int32, bool)`

GetValidlengthOk returns a tuple with the Validlength field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidlength

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) SetValidlength(v int32)`

SetValidlength sets Validlength field to given value.

### HasValidlength

`func (o *BlockIomadCompanyAdminEditLicensesRequestLicensesInner) HasValidlength() bool`

HasValidlength returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


