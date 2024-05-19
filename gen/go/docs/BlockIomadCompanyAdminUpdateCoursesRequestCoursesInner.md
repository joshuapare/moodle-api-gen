# BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | Pointer to **int32** | Course ID | [optional] [default to 0]
**Licensed** | Pointer to **bool** | Course licensed | [optional] [default to false]
**Notifyperiod** | Pointer to **int32** | Course warning email notify period | [optional] [default to 0]
**Shared** | Pointer to **int32** | Course shared value | [optional] [default to 0]
**Validlength** | Pointer to **int32** | Course training valid for in days | [optional] [default to 0]
**Warncompletion** | Pointer to **int32** | Course days to warn if not completed in | [optional] [default to 0]
**Warnexpire** | Pointer to **int32** | Course days to warn before training expires | [optional] [default to 0]

## Methods

### NewBlockIomadCompanyAdminUpdateCoursesRequestCoursesInner

`func NewBlockIomadCompanyAdminUpdateCoursesRequestCoursesInner() *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner`

NewBlockIomadCompanyAdminUpdateCoursesRequestCoursesInner instantiates a new BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBlockIomadCompanyAdminUpdateCoursesRequestCoursesInnerWithDefaults

`func NewBlockIomadCompanyAdminUpdateCoursesRequestCoursesInnerWithDefaults() *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner`

NewBlockIomadCompanyAdminUpdateCoursesRequestCoursesInnerWithDefaults instantiates a new BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetLicensed

`func (o *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner) GetLicensed() bool`

GetLicensed returns the Licensed field if non-nil, zero value otherwise.

### GetLicensedOk

`func (o *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner) GetLicensedOk() (*bool, bool)`

GetLicensedOk returns a tuple with the Licensed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLicensed

`func (o *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner) SetLicensed(v bool)`

SetLicensed sets Licensed field to given value.

### HasLicensed

`func (o *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner) HasLicensed() bool`

HasLicensed returns a boolean if a field has been set.

### GetNotifyperiod

`func (o *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner) GetNotifyperiod() int32`

GetNotifyperiod returns the Notifyperiod field if non-nil, zero value otherwise.

### GetNotifyperiodOk

`func (o *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner) GetNotifyperiodOk() (*int32, bool)`

GetNotifyperiodOk returns a tuple with the Notifyperiod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNotifyperiod

`func (o *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner) SetNotifyperiod(v int32)`

SetNotifyperiod sets Notifyperiod field to given value.

### HasNotifyperiod

`func (o *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner) HasNotifyperiod() bool`

HasNotifyperiod returns a boolean if a field has been set.

### GetShared

`func (o *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner) GetShared() int32`

GetShared returns the Shared field if non-nil, zero value otherwise.

### GetSharedOk

`func (o *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner) GetSharedOk() (*int32, bool)`

GetSharedOk returns a tuple with the Shared field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShared

`func (o *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner) SetShared(v int32)`

SetShared sets Shared field to given value.

### HasShared

`func (o *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner) HasShared() bool`

HasShared returns a boolean if a field has been set.

### GetValidlength

`func (o *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner) GetValidlength() int32`

GetValidlength returns the Validlength field if non-nil, zero value otherwise.

### GetValidlengthOk

`func (o *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner) GetValidlengthOk() (*int32, bool)`

GetValidlengthOk returns a tuple with the Validlength field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidlength

`func (o *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner) SetValidlength(v int32)`

SetValidlength sets Validlength field to given value.

### HasValidlength

`func (o *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner) HasValidlength() bool`

HasValidlength returns a boolean if a field has been set.

### GetWarncompletion

`func (o *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner) GetWarncompletion() int32`

GetWarncompletion returns the Warncompletion field if non-nil, zero value otherwise.

### GetWarncompletionOk

`func (o *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner) GetWarncompletionOk() (*int32, bool)`

GetWarncompletionOk returns a tuple with the Warncompletion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarncompletion

`func (o *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner) SetWarncompletion(v int32)`

SetWarncompletion sets Warncompletion field to given value.

### HasWarncompletion

`func (o *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner) HasWarncompletion() bool`

HasWarncompletion returns a boolean if a field has been set.

### GetWarnexpire

`func (o *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner) GetWarnexpire() int32`

GetWarnexpire returns the Warnexpire field if non-nil, zero value otherwise.

### GetWarnexpireOk

`func (o *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner) GetWarnexpireOk() (*int32, bool)`

GetWarnexpireOk returns a tuple with the Warnexpire field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnexpire

`func (o *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner) SetWarnexpire(v int32)`

SetWarnexpire sets Warnexpire field to given value.

### HasWarnexpire

`func (o *BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner) HasWarnexpire() bool`

HasWarnexpire returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


