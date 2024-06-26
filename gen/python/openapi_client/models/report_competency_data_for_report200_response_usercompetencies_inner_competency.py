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

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List
from openapi_client.models.core_competency_create_competency200_response import CoreCompetencyCreateCompetency200Response
from openapi_client.models.core_competency_duplicate_competency_framework200_response import CoreCompetencyDuplicateCompetencyFramework200Response
from openapi_client.models.core_competency_read_user_evidence200_response_competencies_inner import CoreCompetencyReadUserEvidence200ResponseCompetenciesInner
from openapi_client.models.core_course_get_enrolled_courses_by_timeline_classification200_response_courses_inner import CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner
from openapi_client.models.report_competency_data_for_report200_response_usercompetencies_inner_competency_comppath import ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath
from typing import Optional, Set
from typing_extensions import Self

class ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency(BaseModel):
    """
    ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency
    """ # noqa: E501
    competency: CoreCompetencyCreateCompetency200Response
    comppath: ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath
    framework: CoreCompetencyDuplicateCompetencyFramework200Response
    hascourses: StrictBool = Field(description="hascourses")
    hasrelatedcompetencies: StrictBool = Field(description="hasrelatedcompetencies")
    linkedcourses: List[CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner]
    pluginbaseurl: StrictStr = Field(description="pluginbaseurl")
    relatedcompetencies: List[CoreCompetencyReadUserEvidence200ResponseCompetenciesInner]
    scaleconfiguration: StrictStr = Field(description="scaleconfiguration")
    scaleid: StrictInt = Field(description="scaleid")
    taxonomyterm: StrictStr = Field(description="taxonomyterm")
    __properties: ClassVar[List[str]] = ["competency", "comppath", "framework", "hascourses", "hasrelatedcompetencies", "linkedcourses", "pluginbaseurl", "relatedcompetencies", "scaleconfiguration", "scaleid", "taxonomyterm"]

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
        """Create an instance of ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of competency
        if self.competency:
            _dict['competency'] = self.competency.to_dict()
        # override the default output from pydantic by calling `to_dict()` of comppath
        if self.comppath:
            _dict['comppath'] = self.comppath.to_dict()
        # override the default output from pydantic by calling `to_dict()` of framework
        if self.framework:
            _dict['framework'] = self.framework.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in linkedcourses (list)
        _items = []
        if self.linkedcourses:
            for _item in self.linkedcourses:
                if _item:
                    _items.append(_item.to_dict())
            _dict['linkedcourses'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in relatedcompetencies (list)
        _items = []
        if self.relatedcompetencies:
            for _item in self.relatedcompetencies:
                if _item:
                    _items.append(_item.to_dict())
            _dict['relatedcompetencies'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "competency": CoreCompetencyCreateCompetency200Response.from_dict(obj["competency"]) if obj.get("competency") is not None else None,
            "comppath": ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath.from_dict(obj["comppath"]) if obj.get("comppath") is not None else None,
            "framework": CoreCompetencyDuplicateCompetencyFramework200Response.from_dict(obj["framework"]) if obj.get("framework") is not None else None,
            "hascourses": obj.get("hascourses") if obj.get("hascourses") is not None else False,
            "hasrelatedcompetencies": obj.get("hasrelatedcompetencies") if obj.get("hasrelatedcompetencies") is not None else False,
            "linkedcourses": [CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner.from_dict(_item) for _item in obj["linkedcourses"]] if obj.get("linkedcourses") is not None else None,
            "pluginbaseurl": obj.get("pluginbaseurl"),
            "relatedcompetencies": [CoreCompetencyReadUserEvidence200ResponseCompetenciesInner.from_dict(_item) for _item in obj["relatedcompetencies"]] if obj.get("relatedcompetencies") is not None else None,
            "scaleconfiguration": obj.get("scaleconfiguration"),
            "scaleid": obj.get("scaleid"),
            "taxonomyterm": obj.get("taxonomyterm") if obj.get("taxonomyterm") is not None else 'null'
        })
        return _obj


