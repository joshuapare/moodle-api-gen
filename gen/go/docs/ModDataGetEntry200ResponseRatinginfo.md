# ModDataGetEntry200ResponseRatinginfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Canviewall** | Pointer to **bool** | Whether the user can view all the individual ratings. | [optional] [default to null]
**Canviewany** | Pointer to **bool** | Whether the user can view aggregate of ratings of others. | [optional] [default to null]
**Component** | **string** | Context name. | [default to "null"]
**Contextid** | **int32** | Context id. | [default to null]
**Ratingarea** | **string** | Rating area name. | [default to "null"]
**Ratings** | Pointer to [**[]ModDataGetEntry200ResponseRatinginfoRatingsInner**](ModDataGetEntry200ResponseRatinginfoRatingsInner.md) |  | [optional] 
**Scales** | Pointer to [**[]ModDataGetEntry200ResponseRatinginfoScalesInner**](ModDataGetEntry200ResponseRatinginfoScalesInner.md) |  | [optional] 

## Methods

### NewModDataGetEntry200ResponseRatinginfo

`func NewModDataGetEntry200ResponseRatinginfo(component string, contextid int32, ratingarea string, ) *ModDataGetEntry200ResponseRatinginfo`

NewModDataGetEntry200ResponseRatinginfo instantiates a new ModDataGetEntry200ResponseRatinginfo object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModDataGetEntry200ResponseRatinginfoWithDefaults

`func NewModDataGetEntry200ResponseRatinginfoWithDefaults() *ModDataGetEntry200ResponseRatinginfo`

NewModDataGetEntry200ResponseRatinginfoWithDefaults instantiates a new ModDataGetEntry200ResponseRatinginfo object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCanviewall

`func (o *ModDataGetEntry200ResponseRatinginfo) GetCanviewall() bool`

GetCanviewall returns the Canviewall field if non-nil, zero value otherwise.

### GetCanviewallOk

`func (o *ModDataGetEntry200ResponseRatinginfo) GetCanviewallOk() (*bool, bool)`

GetCanviewallOk returns a tuple with the Canviewall field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanviewall

`func (o *ModDataGetEntry200ResponseRatinginfo) SetCanviewall(v bool)`

SetCanviewall sets Canviewall field to given value.

### HasCanviewall

`func (o *ModDataGetEntry200ResponseRatinginfo) HasCanviewall() bool`

HasCanviewall returns a boolean if a field has been set.

### GetCanviewany

`func (o *ModDataGetEntry200ResponseRatinginfo) GetCanviewany() bool`

GetCanviewany returns the Canviewany field if non-nil, zero value otherwise.

### GetCanviewanyOk

`func (o *ModDataGetEntry200ResponseRatinginfo) GetCanviewanyOk() (*bool, bool)`

GetCanviewanyOk returns a tuple with the Canviewany field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanviewany

`func (o *ModDataGetEntry200ResponseRatinginfo) SetCanviewany(v bool)`

SetCanviewany sets Canviewany field to given value.

### HasCanviewany

`func (o *ModDataGetEntry200ResponseRatinginfo) HasCanviewany() bool`

HasCanviewany returns a boolean if a field has been set.

### GetComponent

`func (o *ModDataGetEntry200ResponseRatinginfo) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *ModDataGetEntry200ResponseRatinginfo) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *ModDataGetEntry200ResponseRatinginfo) SetComponent(v string)`

SetComponent sets Component field to given value.


### GetContextid

`func (o *ModDataGetEntry200ResponseRatinginfo) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *ModDataGetEntry200ResponseRatinginfo) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *ModDataGetEntry200ResponseRatinginfo) SetContextid(v int32)`

SetContextid sets Contextid field to given value.


### GetRatingarea

`func (o *ModDataGetEntry200ResponseRatinginfo) GetRatingarea() string`

GetRatingarea returns the Ratingarea field if non-nil, zero value otherwise.

### GetRatingareaOk

`func (o *ModDataGetEntry200ResponseRatinginfo) GetRatingareaOk() (*string, bool)`

GetRatingareaOk returns a tuple with the Ratingarea field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRatingarea

`func (o *ModDataGetEntry200ResponseRatinginfo) SetRatingarea(v string)`

SetRatingarea sets Ratingarea field to given value.


### GetRatings

`func (o *ModDataGetEntry200ResponseRatinginfo) GetRatings() []ModDataGetEntry200ResponseRatinginfoRatingsInner`

GetRatings returns the Ratings field if non-nil, zero value otherwise.

### GetRatingsOk

`func (o *ModDataGetEntry200ResponseRatinginfo) GetRatingsOk() (*[]ModDataGetEntry200ResponseRatinginfoRatingsInner, bool)`

GetRatingsOk returns a tuple with the Ratings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRatings

`func (o *ModDataGetEntry200ResponseRatinginfo) SetRatings(v []ModDataGetEntry200ResponseRatinginfoRatingsInner)`

SetRatings sets Ratings field to given value.

### HasRatings

`func (o *ModDataGetEntry200ResponseRatinginfo) HasRatings() bool`

HasRatings returns a boolean if a field has been set.

### GetScales

`func (o *ModDataGetEntry200ResponseRatinginfo) GetScales() []ModDataGetEntry200ResponseRatinginfoScalesInner`

GetScales returns the Scales field if non-nil, zero value otherwise.

### GetScalesOk

`func (o *ModDataGetEntry200ResponseRatinginfo) GetScalesOk() (*[]ModDataGetEntry200ResponseRatinginfoScalesInner, bool)`

GetScalesOk returns a tuple with the Scales field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScales

`func (o *ModDataGetEntry200ResponseRatinginfo) SetScales(v []ModDataGetEntry200ResponseRatinginfoScalesInner)`

SetScales sets Scales field to given value.

### HasScales

`func (o *ModDataGetEntry200ResponseRatinginfo) HasScales() bool`

HasScales returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


