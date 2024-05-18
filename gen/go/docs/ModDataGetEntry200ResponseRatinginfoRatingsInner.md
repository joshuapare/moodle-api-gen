# ModDataGetEntry200ResponseRatinginfoRatingsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Aggregate** | Pointer to **float32** | Aggregated ratings grade. | [optional] [default to null]
**Aggregatelabel** | Pointer to **string** | The aggregation label. | [optional] [default to "null"]
**Aggregatestr** | Pointer to **string** | Aggregated ratings as string. | [optional] [default to "null"]
**Canrate** | Pointer to **bool** | Whether the user can rate the item. | [optional] [default to null]
**Canviewaggregate** | Pointer to **bool** | Whether the user can view the aggregated grade. | [optional] [default to null]
**Count** | Pointer to **int32** | Ratings count (used when aggregating). | [optional] [default to null]
**Itemid** | Pointer to **int32** | Item id. | [optional] [default to null]
**Rating** | Pointer to **int32** | The rating the user gave. | [optional] [default to null]
**Scaleid** | Pointer to **int32** | Scale id. | [optional] [default to null]
**Userid** | Pointer to **int32** | User who rated id. | [optional] [default to null]

## Methods

### NewModDataGetEntry200ResponseRatinginfoRatingsInner

`func NewModDataGetEntry200ResponseRatinginfoRatingsInner() *ModDataGetEntry200ResponseRatinginfoRatingsInner`

NewModDataGetEntry200ResponseRatinginfoRatingsInner instantiates a new ModDataGetEntry200ResponseRatinginfoRatingsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModDataGetEntry200ResponseRatinginfoRatingsInnerWithDefaults

`func NewModDataGetEntry200ResponseRatinginfoRatingsInnerWithDefaults() *ModDataGetEntry200ResponseRatinginfoRatingsInner`

NewModDataGetEntry200ResponseRatinginfoRatingsInnerWithDefaults instantiates a new ModDataGetEntry200ResponseRatinginfoRatingsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAggregate

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) GetAggregate() float32`

GetAggregate returns the Aggregate field if non-nil, zero value otherwise.

### GetAggregateOk

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) GetAggregateOk() (*float32, bool)`

GetAggregateOk returns a tuple with the Aggregate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAggregate

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) SetAggregate(v float32)`

SetAggregate sets Aggregate field to given value.

### HasAggregate

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) HasAggregate() bool`

HasAggregate returns a boolean if a field has been set.

### GetAggregatelabel

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) GetAggregatelabel() string`

GetAggregatelabel returns the Aggregatelabel field if non-nil, zero value otherwise.

### GetAggregatelabelOk

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) GetAggregatelabelOk() (*string, bool)`

GetAggregatelabelOk returns a tuple with the Aggregatelabel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAggregatelabel

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) SetAggregatelabel(v string)`

SetAggregatelabel sets Aggregatelabel field to given value.

### HasAggregatelabel

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) HasAggregatelabel() bool`

HasAggregatelabel returns a boolean if a field has been set.

### GetAggregatestr

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) GetAggregatestr() string`

GetAggregatestr returns the Aggregatestr field if non-nil, zero value otherwise.

### GetAggregatestrOk

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) GetAggregatestrOk() (*string, bool)`

GetAggregatestrOk returns a tuple with the Aggregatestr field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAggregatestr

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) SetAggregatestr(v string)`

SetAggregatestr sets Aggregatestr field to given value.

### HasAggregatestr

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) HasAggregatestr() bool`

HasAggregatestr returns a boolean if a field has been set.

### GetCanrate

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) GetCanrate() bool`

GetCanrate returns the Canrate field if non-nil, zero value otherwise.

### GetCanrateOk

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) GetCanrateOk() (*bool, bool)`

GetCanrateOk returns a tuple with the Canrate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanrate

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) SetCanrate(v bool)`

SetCanrate sets Canrate field to given value.

### HasCanrate

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) HasCanrate() bool`

HasCanrate returns a boolean if a field has been set.

### GetCanviewaggregate

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) GetCanviewaggregate() bool`

GetCanviewaggregate returns the Canviewaggregate field if non-nil, zero value otherwise.

### GetCanviewaggregateOk

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) GetCanviewaggregateOk() (*bool, bool)`

GetCanviewaggregateOk returns a tuple with the Canviewaggregate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanviewaggregate

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) SetCanviewaggregate(v bool)`

SetCanviewaggregate sets Canviewaggregate field to given value.

### HasCanviewaggregate

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) HasCanviewaggregate() bool`

HasCanviewaggregate returns a boolean if a field has been set.

### GetCount

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) SetCount(v int32)`

SetCount sets Count field to given value.

### HasCount

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) HasCount() bool`

HasCount returns a boolean if a field has been set.

### GetItemid

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) GetItemid() int32`

GetItemid returns the Itemid field if non-nil, zero value otherwise.

### GetItemidOk

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) GetItemidOk() (*int32, bool)`

GetItemidOk returns a tuple with the Itemid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemid

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) SetItemid(v int32)`

SetItemid sets Itemid field to given value.

### HasItemid

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) HasItemid() bool`

HasItemid returns a boolean if a field has been set.

### GetRating

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) GetRating() int32`

GetRating returns the Rating field if non-nil, zero value otherwise.

### GetRatingOk

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) GetRatingOk() (*int32, bool)`

GetRatingOk returns a tuple with the Rating field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRating

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) SetRating(v int32)`

SetRating sets Rating field to given value.

### HasRating

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) HasRating() bool`

HasRating returns a boolean if a field has been set.

### GetScaleid

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) GetScaleid() int32`

GetScaleid returns the Scaleid field if non-nil, zero value otherwise.

### GetScaleidOk

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) GetScaleidOk() (*int32, bool)`

GetScaleidOk returns a tuple with the Scaleid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScaleid

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) SetScaleid(v int32)`

SetScaleid sets Scaleid field to given value.

### HasScaleid

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) HasScaleid() bool`

HasScaleid returns a boolean if a field has been set.

### GetUserid

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *ModDataGetEntry200ResponseRatinginfoRatingsInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


