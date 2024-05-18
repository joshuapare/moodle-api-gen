# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.gradereport_user_get_grades_table200_response_tables_inner_tabledata_inner_average import GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage
from openapi_client.models.gradereport_user_get_grades_table200_response_tables_inner_tabledata_inner_contributiontocoursetotal import GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal
from openapi_client.models.gradereport_user_get_grades_table200_response_tables_inner_tabledata_inner_itemname import GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerItemname
from openapi_client.models.gradereport_user_get_grades_table200_response_tables_inner_tabledata_inner_leader import GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerLeader
from typing import Optional, Set
from typing_extensions import Self

class GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner(BaseModel):
    """
    table
    """ # noqa: E501
    average: Optional[GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage] = None
    contributiontocoursetotal: Optional[GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal] = None
    feedback: Optional[GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal] = None
    grade: Optional[GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal] = None
    itemname: Optional[GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerItemname] = None
    leader: Optional[GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerLeader] = None
    lettergrade: Optional[GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal] = None
    parentcategories: Optional[List[Dict[str, Any]]] = None
    percentage: Optional[GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal] = None
    range: Optional[GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal] = None
    rank: Optional[GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal] = None
    weight: Optional[GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal] = None
    __properties: ClassVar[List[str]] = ["average", "contributiontocoursetotal", "feedback", "grade", "itemname", "leader", "lettergrade", "parentcategories", "percentage", "range", "rank", "weight"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of average
        if self.average:
            _dict['average'] = self.average.to_dict()
        # override the default output from pydantic by calling `to_dict()` of contributiontocoursetotal
        if self.contributiontocoursetotal:
            _dict['contributiontocoursetotal'] = self.contributiontocoursetotal.to_dict()
        # override the default output from pydantic by calling `to_dict()` of feedback
        if self.feedback:
            _dict['feedback'] = self.feedback.to_dict()
        # override the default output from pydantic by calling `to_dict()` of grade
        if self.grade:
            _dict['grade'] = self.grade.to_dict()
        # override the default output from pydantic by calling `to_dict()` of itemname
        if self.itemname:
            _dict['itemname'] = self.itemname.to_dict()
        # override the default output from pydantic by calling `to_dict()` of leader
        if self.leader:
            _dict['leader'] = self.leader.to_dict()
        # override the default output from pydantic by calling `to_dict()` of lettergrade
        if self.lettergrade:
            _dict['lettergrade'] = self.lettergrade.to_dict()
        # override the default output from pydantic by calling `to_dict()` of percentage
        if self.percentage:
            _dict['percentage'] = self.percentage.to_dict()
        # override the default output from pydantic by calling `to_dict()` of range
        if self.range:
            _dict['range'] = self.range.to_dict()
        # override the default output from pydantic by calling `to_dict()` of rank
        if self.rank:
            _dict['rank'] = self.rank.to_dict()
        # override the default output from pydantic by calling `to_dict()` of weight
        if self.weight:
            _dict['weight'] = self.weight.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "average": GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage.from_dict(obj["average"]) if obj.get("average") is not None else None,
            "contributiontocoursetotal": GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.from_dict(obj["contributiontocoursetotal"]) if obj.get("contributiontocoursetotal") is not None else None,
            "feedback": GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.from_dict(obj["feedback"]) if obj.get("feedback") is not None else None,
            "grade": GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.from_dict(obj["grade"]) if obj.get("grade") is not None else None,
            "itemname": GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerItemname.from_dict(obj["itemname"]) if obj.get("itemname") is not None else None,
            "leader": GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerLeader.from_dict(obj["leader"]) if obj.get("leader") is not None else None,
            "lettergrade": GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.from_dict(obj["lettergrade"]) if obj.get("lettergrade") is not None else None,
            "parentcategories": obj.get("parentcategories"),
            "percentage": GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.from_dict(obj["percentage"]) if obj.get("percentage") is not None else None,
            "range": GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.from_dict(obj["range"]) if obj.get("range") is not None else None,
            "rank": GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.from_dict(obj["rank"]) if obj.get("rank") is not None else None,
            "weight": GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.from_dict(obj["weight"]) if obj.get("weight") is not None else None
        })
        return _obj


