# CoreGradesUpdateGradesRequestItemdetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Deleted** | Pointer to **bool** | True if the grade item should be deleted | [optional] [default to null]
**Grademax** | Pointer to **float32** | Maximum grade allowed | [optional] [default to null]
**Grademin** | Pointer to **float32** | Minimum grade allowed | [optional] [default to null]
**Gradetype** | Pointer to **int32** | The type of grade (0 &#x3D; none, 1 &#x3D; value, 2 &#x3D; scale, 3 &#x3D; text) | [optional] [default to null]
**Hidden** | Pointer to **bool** | True if the grade item is hidden | [optional] [default to null]
**Idnumber** | Pointer to **int32** | Arbitrary ID provided by the module responsible for the grade item | [optional] [default to null]
**Itemname** | Pointer to **string** | The grade item name | [optional] [default to "null"]
**Multfactor** | Pointer to **float32** | Multiply all grades by this number | [optional] [default to null]
**Plusfactor** | Pointer to **float32** | Add this to all grades | [optional] [default to null]
**Scaleid** | Pointer to **int32** | The ID of the custom scale being is used | [optional] [default to null]

## Methods

### NewCoreGradesUpdateGradesRequestItemdetails

`func NewCoreGradesUpdateGradesRequestItemdetails() *CoreGradesUpdateGradesRequestItemdetails`

NewCoreGradesUpdateGradesRequestItemdetails instantiates a new CoreGradesUpdateGradesRequestItemdetails object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGradesUpdateGradesRequestItemdetailsWithDefaults

`func NewCoreGradesUpdateGradesRequestItemdetailsWithDefaults() *CoreGradesUpdateGradesRequestItemdetails`

NewCoreGradesUpdateGradesRequestItemdetailsWithDefaults instantiates a new CoreGradesUpdateGradesRequestItemdetails object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDeleted

`func (o *CoreGradesUpdateGradesRequestItemdetails) GetDeleted() bool`

GetDeleted returns the Deleted field if non-nil, zero value otherwise.

### GetDeletedOk

`func (o *CoreGradesUpdateGradesRequestItemdetails) GetDeletedOk() (*bool, bool)`

GetDeletedOk returns a tuple with the Deleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeleted

`func (o *CoreGradesUpdateGradesRequestItemdetails) SetDeleted(v bool)`

SetDeleted sets Deleted field to given value.

### HasDeleted

`func (o *CoreGradesUpdateGradesRequestItemdetails) HasDeleted() bool`

HasDeleted returns a boolean if a field has been set.

### GetGrademax

`func (o *CoreGradesUpdateGradesRequestItemdetails) GetGrademax() float32`

GetGrademax returns the Grademax field if non-nil, zero value otherwise.

### GetGrademaxOk

`func (o *CoreGradesUpdateGradesRequestItemdetails) GetGrademaxOk() (*float32, bool)`

GetGrademaxOk returns a tuple with the Grademax field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrademax

`func (o *CoreGradesUpdateGradesRequestItemdetails) SetGrademax(v float32)`

SetGrademax sets Grademax field to given value.

### HasGrademax

`func (o *CoreGradesUpdateGradesRequestItemdetails) HasGrademax() bool`

HasGrademax returns a boolean if a field has been set.

### GetGrademin

`func (o *CoreGradesUpdateGradesRequestItemdetails) GetGrademin() float32`

GetGrademin returns the Grademin field if non-nil, zero value otherwise.

### GetGrademinOk

`func (o *CoreGradesUpdateGradesRequestItemdetails) GetGrademinOk() (*float32, bool)`

GetGrademinOk returns a tuple with the Grademin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrademin

`func (o *CoreGradesUpdateGradesRequestItemdetails) SetGrademin(v float32)`

SetGrademin sets Grademin field to given value.

### HasGrademin

`func (o *CoreGradesUpdateGradesRequestItemdetails) HasGrademin() bool`

HasGrademin returns a boolean if a field has been set.

### GetGradetype

`func (o *CoreGradesUpdateGradesRequestItemdetails) GetGradetype() int32`

GetGradetype returns the Gradetype field if non-nil, zero value otherwise.

### GetGradetypeOk

`func (o *CoreGradesUpdateGradesRequestItemdetails) GetGradetypeOk() (*int32, bool)`

GetGradetypeOk returns a tuple with the Gradetype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradetype

`func (o *CoreGradesUpdateGradesRequestItemdetails) SetGradetype(v int32)`

SetGradetype sets Gradetype field to given value.

### HasGradetype

`func (o *CoreGradesUpdateGradesRequestItemdetails) HasGradetype() bool`

HasGradetype returns a boolean if a field has been set.

### GetHidden

`func (o *CoreGradesUpdateGradesRequestItemdetails) GetHidden() bool`

GetHidden returns the Hidden field if non-nil, zero value otherwise.

### GetHiddenOk

`func (o *CoreGradesUpdateGradesRequestItemdetails) GetHiddenOk() (*bool, bool)`

GetHiddenOk returns a tuple with the Hidden field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHidden

`func (o *CoreGradesUpdateGradesRequestItemdetails) SetHidden(v bool)`

SetHidden sets Hidden field to given value.

### HasHidden

`func (o *CoreGradesUpdateGradesRequestItemdetails) HasHidden() bool`

HasHidden returns a boolean if a field has been set.

### GetIdnumber

`func (o *CoreGradesUpdateGradesRequestItemdetails) GetIdnumber() int32`

GetIdnumber returns the Idnumber field if non-nil, zero value otherwise.

### GetIdnumberOk

`func (o *CoreGradesUpdateGradesRequestItemdetails) GetIdnumberOk() (*int32, bool)`

GetIdnumberOk returns a tuple with the Idnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdnumber

`func (o *CoreGradesUpdateGradesRequestItemdetails) SetIdnumber(v int32)`

SetIdnumber sets Idnumber field to given value.

### HasIdnumber

`func (o *CoreGradesUpdateGradesRequestItemdetails) HasIdnumber() bool`

HasIdnumber returns a boolean if a field has been set.

### GetItemname

`func (o *CoreGradesUpdateGradesRequestItemdetails) GetItemname() string`

GetItemname returns the Itemname field if non-nil, zero value otherwise.

### GetItemnameOk

`func (o *CoreGradesUpdateGradesRequestItemdetails) GetItemnameOk() (*string, bool)`

GetItemnameOk returns a tuple with the Itemname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemname

`func (o *CoreGradesUpdateGradesRequestItemdetails) SetItemname(v string)`

SetItemname sets Itemname field to given value.

### HasItemname

`func (o *CoreGradesUpdateGradesRequestItemdetails) HasItemname() bool`

HasItemname returns a boolean if a field has been set.

### GetMultfactor

`func (o *CoreGradesUpdateGradesRequestItemdetails) GetMultfactor() float32`

GetMultfactor returns the Multfactor field if non-nil, zero value otherwise.

### GetMultfactorOk

`func (o *CoreGradesUpdateGradesRequestItemdetails) GetMultfactorOk() (*float32, bool)`

GetMultfactorOk returns a tuple with the Multfactor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMultfactor

`func (o *CoreGradesUpdateGradesRequestItemdetails) SetMultfactor(v float32)`

SetMultfactor sets Multfactor field to given value.

### HasMultfactor

`func (o *CoreGradesUpdateGradesRequestItemdetails) HasMultfactor() bool`

HasMultfactor returns a boolean if a field has been set.

### GetPlusfactor

`func (o *CoreGradesUpdateGradesRequestItemdetails) GetPlusfactor() float32`

GetPlusfactor returns the Plusfactor field if non-nil, zero value otherwise.

### GetPlusfactorOk

`func (o *CoreGradesUpdateGradesRequestItemdetails) GetPlusfactorOk() (*float32, bool)`

GetPlusfactorOk returns a tuple with the Plusfactor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlusfactor

`func (o *CoreGradesUpdateGradesRequestItemdetails) SetPlusfactor(v float32)`

SetPlusfactor sets Plusfactor field to given value.

### HasPlusfactor

`func (o *CoreGradesUpdateGradesRequestItemdetails) HasPlusfactor() bool`

HasPlusfactor returns a boolean if a field has been set.

### GetScaleid

`func (o *CoreGradesUpdateGradesRequestItemdetails) GetScaleid() int32`

GetScaleid returns the Scaleid field if non-nil, zero value otherwise.

### GetScaleidOk

`func (o *CoreGradesUpdateGradesRequestItemdetails) GetScaleidOk() (*int32, bool)`

GetScaleidOk returns a tuple with the Scaleid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScaleid

`func (o *CoreGradesUpdateGradesRequestItemdetails) SetScaleid(v int32)`

SetScaleid sets Scaleid field to given value.

### HasScaleid

`func (o *CoreGradesUpdateGradesRequestItemdetails) HasScaleid() bool`

HasScaleid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


