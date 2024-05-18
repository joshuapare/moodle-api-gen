# CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Aggregateonlygraded** | Pointer to **bool** | exclude empty grades | [optional] [default to null]
**Aggregateoutcomes** | Pointer to **bool** | aggregate outcomes | [optional] [default to null]
**Aggregation** | Pointer to **int32** | aggregation method | [optional] [default to null]
**Aggregationcoef2** | Pointer to **string** | weight coefficient | [optional] [default to "null"]
**Decimals** | Pointer to **int32** | the decimal count | [optional] [default to null]
**Display** | Pointer to **int32** | the display type | [optional] [default to null]
**Droplow** | Pointer to **int32** | drop low grades | [optional] [default to null]
**Grademax** | Pointer to **int32** | the grade max | [optional] [default to null]
**Grademin** | Pointer to **int32** | the grade min | [optional] [default to null]
**Gradepass** | Pointer to **int32** | the grade to pass | [optional] [default to null]
**Gradetype** | Pointer to **int32** | the grade type | [optional] [default to null]
**Hiddenuntil** | Pointer to **int32** | grades hidden until | [optional] [default to null]
**Idnumber** | Pointer to **string** | the category idnumber | [optional] [default to "null"]
**Iteminfo** | Pointer to **string** | the category iteminfo | [optional] [default to "null"]
**Itemname** | Pointer to **string** | the category total name | [optional] [default to "null"]
**Locktime** | Pointer to **int32** | lock grades after | [optional] [default to null]
**Parentcategoryid** | Pointer to **int32** | The parent category id | [optional] [default to null]
**Parentcategoryidnumber** | Pointer to **string** | the parent category idnumber | [optional] [default to "null"]
**Weightoverride** | Pointer to **bool** | weight adjusted | [optional] [default to null]

## Methods

### NewCoreGradesCreateGradecategoriesRequestCategoriesInnerOptions

`func NewCoreGradesCreateGradecategoriesRequestCategoriesInnerOptions() *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions`

NewCoreGradesCreateGradecategoriesRequestCategoriesInnerOptions instantiates a new CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGradesCreateGradecategoriesRequestCategoriesInnerOptionsWithDefaults

`func NewCoreGradesCreateGradecategoriesRequestCategoriesInnerOptionsWithDefaults() *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions`

NewCoreGradesCreateGradecategoriesRequestCategoriesInnerOptionsWithDefaults instantiates a new CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAggregateonlygraded

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetAggregateonlygraded() bool`

GetAggregateonlygraded returns the Aggregateonlygraded field if non-nil, zero value otherwise.

### GetAggregateonlygradedOk

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetAggregateonlygradedOk() (*bool, bool)`

GetAggregateonlygradedOk returns a tuple with the Aggregateonlygraded field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAggregateonlygraded

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) SetAggregateonlygraded(v bool)`

SetAggregateonlygraded sets Aggregateonlygraded field to given value.

### HasAggregateonlygraded

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) HasAggregateonlygraded() bool`

HasAggregateonlygraded returns a boolean if a field has been set.

### GetAggregateoutcomes

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetAggregateoutcomes() bool`

GetAggregateoutcomes returns the Aggregateoutcomes field if non-nil, zero value otherwise.

### GetAggregateoutcomesOk

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetAggregateoutcomesOk() (*bool, bool)`

GetAggregateoutcomesOk returns a tuple with the Aggregateoutcomes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAggregateoutcomes

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) SetAggregateoutcomes(v bool)`

SetAggregateoutcomes sets Aggregateoutcomes field to given value.

### HasAggregateoutcomes

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) HasAggregateoutcomes() bool`

HasAggregateoutcomes returns a boolean if a field has been set.

### GetAggregation

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetAggregation() int32`

GetAggregation returns the Aggregation field if non-nil, zero value otherwise.

### GetAggregationOk

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetAggregationOk() (*int32, bool)`

GetAggregationOk returns a tuple with the Aggregation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAggregation

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) SetAggregation(v int32)`

SetAggregation sets Aggregation field to given value.

### HasAggregation

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) HasAggregation() bool`

HasAggregation returns a boolean if a field has been set.

### GetAggregationcoef2

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetAggregationcoef2() string`

GetAggregationcoef2 returns the Aggregationcoef2 field if non-nil, zero value otherwise.

### GetAggregationcoef2Ok

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetAggregationcoef2Ok() (*string, bool)`

GetAggregationcoef2Ok returns a tuple with the Aggregationcoef2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAggregationcoef2

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) SetAggregationcoef2(v string)`

SetAggregationcoef2 sets Aggregationcoef2 field to given value.

### HasAggregationcoef2

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) HasAggregationcoef2() bool`

HasAggregationcoef2 returns a boolean if a field has been set.

### GetDecimals

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetDecimals() int32`

GetDecimals returns the Decimals field if non-nil, zero value otherwise.

### GetDecimalsOk

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetDecimalsOk() (*int32, bool)`

GetDecimalsOk returns a tuple with the Decimals field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDecimals

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) SetDecimals(v int32)`

SetDecimals sets Decimals field to given value.

### HasDecimals

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) HasDecimals() bool`

HasDecimals returns a boolean if a field has been set.

### GetDisplay

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetDisplay() int32`

GetDisplay returns the Display field if non-nil, zero value otherwise.

### GetDisplayOk

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetDisplayOk() (*int32, bool)`

GetDisplayOk returns a tuple with the Display field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplay

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) SetDisplay(v int32)`

SetDisplay sets Display field to given value.

### HasDisplay

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) HasDisplay() bool`

HasDisplay returns a boolean if a field has been set.

### GetDroplow

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetDroplow() int32`

GetDroplow returns the Droplow field if non-nil, zero value otherwise.

### GetDroplowOk

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetDroplowOk() (*int32, bool)`

GetDroplowOk returns a tuple with the Droplow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDroplow

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) SetDroplow(v int32)`

SetDroplow sets Droplow field to given value.

### HasDroplow

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) HasDroplow() bool`

HasDroplow returns a boolean if a field has been set.

### GetGrademax

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetGrademax() int32`

GetGrademax returns the Grademax field if non-nil, zero value otherwise.

### GetGrademaxOk

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetGrademaxOk() (*int32, bool)`

GetGrademaxOk returns a tuple with the Grademax field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrademax

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) SetGrademax(v int32)`

SetGrademax sets Grademax field to given value.

### HasGrademax

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) HasGrademax() bool`

HasGrademax returns a boolean if a field has been set.

### GetGrademin

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetGrademin() int32`

GetGrademin returns the Grademin field if non-nil, zero value otherwise.

### GetGrademinOk

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetGrademinOk() (*int32, bool)`

GetGrademinOk returns a tuple with the Grademin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrademin

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) SetGrademin(v int32)`

SetGrademin sets Grademin field to given value.

### HasGrademin

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) HasGrademin() bool`

HasGrademin returns a boolean if a field has been set.

### GetGradepass

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetGradepass() int32`

GetGradepass returns the Gradepass field if non-nil, zero value otherwise.

### GetGradepassOk

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetGradepassOk() (*int32, bool)`

GetGradepassOk returns a tuple with the Gradepass field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradepass

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) SetGradepass(v int32)`

SetGradepass sets Gradepass field to given value.

### HasGradepass

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) HasGradepass() bool`

HasGradepass returns a boolean if a field has been set.

### GetGradetype

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetGradetype() int32`

GetGradetype returns the Gradetype field if non-nil, zero value otherwise.

### GetGradetypeOk

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetGradetypeOk() (*int32, bool)`

GetGradetypeOk returns a tuple with the Gradetype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGradetype

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) SetGradetype(v int32)`

SetGradetype sets Gradetype field to given value.

### HasGradetype

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) HasGradetype() bool`

HasGradetype returns a boolean if a field has been set.

### GetHiddenuntil

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetHiddenuntil() int32`

GetHiddenuntil returns the Hiddenuntil field if non-nil, zero value otherwise.

### GetHiddenuntilOk

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetHiddenuntilOk() (*int32, bool)`

GetHiddenuntilOk returns a tuple with the Hiddenuntil field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHiddenuntil

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) SetHiddenuntil(v int32)`

SetHiddenuntil sets Hiddenuntil field to given value.

### HasHiddenuntil

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) HasHiddenuntil() bool`

HasHiddenuntil returns a boolean if a field has been set.

### GetIdnumber

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetIdnumber() string`

GetIdnumber returns the Idnumber field if non-nil, zero value otherwise.

### GetIdnumberOk

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetIdnumberOk() (*string, bool)`

GetIdnumberOk returns a tuple with the Idnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdnumber

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) SetIdnumber(v string)`

SetIdnumber sets Idnumber field to given value.

### HasIdnumber

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) HasIdnumber() bool`

HasIdnumber returns a boolean if a field has been set.

### GetIteminfo

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetIteminfo() string`

GetIteminfo returns the Iteminfo field if non-nil, zero value otherwise.

### GetIteminfoOk

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetIteminfoOk() (*string, bool)`

GetIteminfoOk returns a tuple with the Iteminfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIteminfo

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) SetIteminfo(v string)`

SetIteminfo sets Iteminfo field to given value.

### HasIteminfo

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) HasIteminfo() bool`

HasIteminfo returns a boolean if a field has been set.

### GetItemname

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetItemname() string`

GetItemname returns the Itemname field if non-nil, zero value otherwise.

### GetItemnameOk

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetItemnameOk() (*string, bool)`

GetItemnameOk returns a tuple with the Itemname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemname

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) SetItemname(v string)`

SetItemname sets Itemname field to given value.

### HasItemname

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) HasItemname() bool`

HasItemname returns a boolean if a field has been set.

### GetLocktime

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetLocktime() int32`

GetLocktime returns the Locktime field if non-nil, zero value otherwise.

### GetLocktimeOk

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetLocktimeOk() (*int32, bool)`

GetLocktimeOk returns a tuple with the Locktime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocktime

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) SetLocktime(v int32)`

SetLocktime sets Locktime field to given value.

### HasLocktime

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) HasLocktime() bool`

HasLocktime returns a boolean if a field has been set.

### GetParentcategoryid

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetParentcategoryid() int32`

GetParentcategoryid returns the Parentcategoryid field if non-nil, zero value otherwise.

### GetParentcategoryidOk

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetParentcategoryidOk() (*int32, bool)`

GetParentcategoryidOk returns a tuple with the Parentcategoryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentcategoryid

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) SetParentcategoryid(v int32)`

SetParentcategoryid sets Parentcategoryid field to given value.

### HasParentcategoryid

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) HasParentcategoryid() bool`

HasParentcategoryid returns a boolean if a field has been set.

### GetParentcategoryidnumber

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetParentcategoryidnumber() string`

GetParentcategoryidnumber returns the Parentcategoryidnumber field if non-nil, zero value otherwise.

### GetParentcategoryidnumberOk

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetParentcategoryidnumberOk() (*string, bool)`

GetParentcategoryidnumberOk returns a tuple with the Parentcategoryidnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentcategoryidnumber

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) SetParentcategoryidnumber(v string)`

SetParentcategoryidnumber sets Parentcategoryidnumber field to given value.

### HasParentcategoryidnumber

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) HasParentcategoryidnumber() bool`

HasParentcategoryidnumber returns a boolean if a field has been set.

### GetWeightoverride

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetWeightoverride() bool`

GetWeightoverride returns the Weightoverride field if non-nil, zero value otherwise.

### GetWeightoverrideOk

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) GetWeightoverrideOk() (*bool, bool)`

GetWeightoverrideOk returns a tuple with the Weightoverride field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWeightoverride

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) SetWeightoverride(v bool)`

SetWeightoverride sets Weightoverride field to given value.

### HasWeightoverride

`func (o *CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions) HasWeightoverride() bool`

HasWeightoverride returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


