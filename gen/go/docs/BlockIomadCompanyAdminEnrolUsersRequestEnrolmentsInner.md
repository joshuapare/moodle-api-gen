# BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | Pointer to **int32** | The course to enrol the user role in | [optional] [default to null]
**Quantity** | Pointer to **int32** | Number of items purchased. | [optional] [default to null]
**Roleid** | Pointer to **int32** | Role to assign to the user | [optional] [default to null]
**Suspend** | Pointer to **int32** | set to 1 to suspend the enrolment | [optional] [default to null]
**Timeend** | Pointer to **int32** | Timestamp when the enrolment end | [optional] [default to null]
**Timestart** | Pointer to **int32** | Timestamp when the enrolment start | [optional] [default to null]
**Userid** | Pointer to **int32** | The user that is going to be enrolled | [optional] [default to null]

## Methods

### NewBlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner

`func NewBlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner() *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner`

NewBlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner instantiates a new BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInnerWithDefaults

`func NewBlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInnerWithDefaults() *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner`

NewBlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInnerWithDefaults instantiates a new BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetQuantity

`func (o *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner) GetQuantity() int32`

GetQuantity returns the Quantity field if non-nil, zero value otherwise.

### GetQuantityOk

`func (o *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner) GetQuantityOk() (*int32, bool)`

GetQuantityOk returns a tuple with the Quantity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuantity

`func (o *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner) SetQuantity(v int32)`

SetQuantity sets Quantity field to given value.

### HasQuantity

`func (o *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner) HasQuantity() bool`

HasQuantity returns a boolean if a field has been set.

### GetRoleid

`func (o *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner) GetRoleid() int32`

GetRoleid returns the Roleid field if non-nil, zero value otherwise.

### GetRoleidOk

`func (o *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner) GetRoleidOk() (*int32, bool)`

GetRoleidOk returns a tuple with the Roleid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoleid

`func (o *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner) SetRoleid(v int32)`

SetRoleid sets Roleid field to given value.

### HasRoleid

`func (o *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner) HasRoleid() bool`

HasRoleid returns a boolean if a field has been set.

### GetSuspend

`func (o *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner) GetSuspend() int32`

GetSuspend returns the Suspend field if non-nil, zero value otherwise.

### GetSuspendOk

`func (o *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner) GetSuspendOk() (*int32, bool)`

GetSuspendOk returns a tuple with the Suspend field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuspend

`func (o *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner) SetSuspend(v int32)`

SetSuspend sets Suspend field to given value.

### HasSuspend

`func (o *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner) HasSuspend() bool`

HasSuspend returns a boolean if a field has been set.

### GetTimeend

`func (o *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner) GetTimeend() int32`

GetTimeend returns the Timeend field if non-nil, zero value otherwise.

### GetTimeendOk

`func (o *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner) GetTimeendOk() (*int32, bool)`

GetTimeendOk returns a tuple with the Timeend field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeend

`func (o *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner) SetTimeend(v int32)`

SetTimeend sets Timeend field to given value.

### HasTimeend

`func (o *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner) HasTimeend() bool`

HasTimeend returns a boolean if a field has been set.

### GetTimestart

`func (o *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner) GetTimestart() int32`

GetTimestart returns the Timestart field if non-nil, zero value otherwise.

### GetTimestartOk

`func (o *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner) GetTimestartOk() (*int32, bool)`

GetTimestartOk returns a tuple with the Timestart field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestart

`func (o *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner) SetTimestart(v int32)`

SetTimestart sets Timestart field to given value.

### HasTimestart

`func (o *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner) HasTimestart() bool`

HasTimestart returns a boolean if a field has been set.

### GetUserid

`func (o *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


