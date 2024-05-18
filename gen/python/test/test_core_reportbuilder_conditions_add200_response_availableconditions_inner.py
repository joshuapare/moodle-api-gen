# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_reportbuilder_conditions_add200_response_availableconditions_inner import CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner

class TestCoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner(unittest.TestCase):
    """CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner:
        """Test CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner`
        """
        model = CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner()
        if include_optional:
            return CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner(
                optiongroup = openapi_client.models.core_reportbuilder_conditions_add_200_response_availableconditions_inner_optiongroup.core_reportbuilder_conditions_add_200_response_availableconditions_inner_optiongroup(
                    text = 'null', 
                    values = [
                        openapi_client.models.core_reportbuilder_conditions_add_200_response_availableconditions_inner_optiongroup_values_inner.core_reportbuilder_conditions_add_200_response_availableconditions_inner_optiongroup_values_inner(
                            value = 'null', 
                            visiblename = 'null', )
                        ], )
            )
        else:
            return CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner(
        )
        """

    def testCoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner(self):
        """Test CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()