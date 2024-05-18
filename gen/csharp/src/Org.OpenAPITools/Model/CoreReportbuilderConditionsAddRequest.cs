/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// CoreReportbuilderConditionsAddRequest
    /// </summary>
    [DataContract(Name = "core_reportbuilder_conditions_add_request")]
    public partial class CoreReportbuilderConditionsAddRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreReportbuilderConditionsAddRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreReportbuilderConditionsAddRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreReportbuilderConditionsAddRequest" /> class.
        /// </summary>
        /// <param name="reportid">Report ID (required).</param>
        /// <param name="uniqueidentifier">Unique identifier of the condition (required) (default to &quot;null&quot;).</param>
        public CoreReportbuilderConditionsAddRequest(int reportid = default(int), string uniqueidentifier = @"null")
        {
            this.Reportid = reportid;
            // to ensure "uniqueidentifier" is required (not null)
            if (uniqueidentifier == null)
            {
                throw new ArgumentNullException("uniqueidentifier is a required property for CoreReportbuilderConditionsAddRequest and cannot be null");
            }
            this.Uniqueidentifier = uniqueidentifier;
        }

        /// <summary>
        /// Report ID
        /// </summary>
        /// <value>Report ID</value>
        [DataMember(Name = "reportid", IsRequired = true, EmitDefaultValue = true)]
        public int Reportid { get; set; }

        /// <summary>
        /// Unique identifier of the condition
        /// </summary>
        /// <value>Unique identifier of the condition</value>
        [DataMember(Name = "uniqueidentifier", IsRequired = true, EmitDefaultValue = true)]
        public string Uniqueidentifier { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreReportbuilderConditionsAddRequest {\n");
            sb.Append("  Reportid: ").Append(Reportid).Append("\n");
            sb.Append("  Uniqueidentifier: ").Append(Uniqueidentifier).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}