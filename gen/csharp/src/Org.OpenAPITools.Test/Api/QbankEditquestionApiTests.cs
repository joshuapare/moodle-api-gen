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
    ///  Class for testing QbankEditquestionApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class QbankEditquestionApiTests : IDisposable
    {
        private QbankEditquestionApi instance;

        public QbankEditquestionApiTests()
        {
            instance = new QbankEditquestionApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of QbankEditquestionApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' QbankEditquestionApi
            //Assert.IsType<QbankEditquestionApi>(instance);
        }

        /// <summary>
        /// Test QbankEditquestionSetStatus
        /// </summary>
        [Fact]
        public void QbankEditquestionSetStatusTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //QbankEditquestionSetStatusRequest qbankEditquestionSetStatusRequest = null;
            //var response = instance.QbankEditquestionSetStatus(qbankEditquestionSetStatusRequest);
            //Assert.IsType<QbankEditquestionSetStatus200Response>(response);
        }
    }
}
