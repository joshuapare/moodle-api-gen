/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using Org.OpenAPITools.Client;
using Org.OpenAPITools.Api;
// uncomment below to import models
//using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Test.Api
{
    /// <summary>
    ///  Class for testing ToolTemplatelibraryApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class ToolTemplatelibraryApiTests : IDisposable
    {
        private ToolTemplatelibraryApi instance;

        public ToolTemplatelibraryApiTests()
        {
            instance = new ToolTemplatelibraryApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of ToolTemplatelibraryApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' ToolTemplatelibraryApi
            //Assert.IsType<ToolTemplatelibraryApi>(instance);
        }

        /// <summary>
        /// Test ToolTemplatelibraryListTemplates
        /// </summary>
        [Fact]
        public void ToolTemplatelibraryListTemplatesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ToolTemplatelibraryListTemplatesRequest toolTemplatelibraryListTemplatesRequest = null;
            //var response = instance.ToolTemplatelibraryListTemplates(toolTemplatelibraryListTemplatesRequest);
            //Assert.IsType<Object>(response);
        }

        /// <summary>
        /// Test ToolTemplatelibraryLoadCanonicalTemplate
        /// </summary>
        [Fact]
        public void ToolTemplatelibraryLoadCanonicalTemplateTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ToolTemplatelibraryLoadCanonicalTemplateRequest toolTemplatelibraryLoadCanonicalTemplateRequest = null;
            //var response = instance.ToolTemplatelibraryLoadCanonicalTemplate(toolTemplatelibraryLoadCanonicalTemplateRequest);
            //Assert.IsType<Object>(response);
        }
    }
}
