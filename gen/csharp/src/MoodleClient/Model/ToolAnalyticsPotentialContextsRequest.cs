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
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// ToolAnalyticsPotentialContextsRequest
    /// </summary>
    [DataContract(Name = "tool_analytics_potential_contexts_request")]
    public partial class ToolAnalyticsPotentialContextsRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolAnalyticsPotentialContextsRequest" /> class.
        /// </summary>
        /// <param name="modelid">The model id (default to null).</param>
        /// <param name="query">The model id (default to &quot;null&quot;).</param>
        public ToolAnalyticsPotentialContextsRequest(int modelid = null, string query = @"null")
        {
            this.Modelid = modelid;
            // use default value if no "query" provided
            this.Query = query ?? @"null";
        }

        /// <summary>
        /// The model id
        /// </summary>
        /// <value>The model id</value>
        [DataMember(Name = "modelid", EmitDefaultValue = false)]
        public int Modelid { get; set; }

        /// <summary>
        /// The model id
        /// </summary>
        /// <value>The model id</value>
        [DataMember(Name = "query", EmitDefaultValue = false)]
        public string Query { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ToolAnalyticsPotentialContextsRequest {\n");
            sb.Append("  Modelid: ").Append(Modelid).Append("\n");
            sb.Append("  Query: ").Append(Query).Append("\n");
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
