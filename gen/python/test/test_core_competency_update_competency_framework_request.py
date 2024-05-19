# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_competency_update_competency_framework_request import CoreCompetencyUpdateCompetencyFrameworkRequest

class TestCoreCompetencyUpdateCompetencyFrameworkRequest(unittest.TestCase):
    """CoreCompetencyUpdateCompetencyFrameworkRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreCompetencyUpdateCompetencyFrameworkRequest:
        """Test CoreCompetencyUpdateCompetencyFrameworkRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreCompetencyUpdateCompetencyFrameworkRequest`
        """
        model = CoreCompetencyUpdateCompetencyFrameworkRequest()
        if include_optional:
            return CoreCompetencyUpdateCompetencyFrameworkRequest(
                competencyframework = openapi_client.models.core_competency_update_competency_framework_request_competencyframework.core_competency_update_competency_framework_request_competencyframework(
                    contextid = 56, 
                    contextlevel = '', 
                    description = '', 
                    descriptionformat = 56, 
                    id = 56, 
                    idnumber = '', 
                    instanceid = 56, 
                    scaleconfiguration = '', 
                    scaleid = 56, 
                    shortname = '', 
                    taxonomies = 'null', 
                    timecreated = 56, 
                    timemodified = 56, 
                    usermodified = 56, 
                    visible = True, )
            )
        else:
            return CoreCompetencyUpdateCompetencyFrameworkRequest(
                competencyframework = openapi_client.models.core_competency_update_competency_framework_request_competencyframework.core_competency_update_competency_framework_request_competencyframework(
                    contextid = 56, 
                    contextlevel = '', 
                    description = '', 
                    descriptionformat = 56, 
                    id = 56, 
                    idnumber = '', 
                    instanceid = 56, 
                    scaleconfiguration = '', 
                    scaleid = 56, 
                    shortname = '', 
                    taxonomies = 'null', 
                    timecreated = 56, 
                    timemodified = 56, 
                    usermodified = 56, 
                    visible = True, ),
        )
        """

    def testCoreCompetencyUpdateCompetencyFrameworkRequest(self):
        """Test CoreCompetencyUpdateCompetencyFrameworkRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
