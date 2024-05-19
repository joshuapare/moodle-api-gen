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
    /// ToolUsertoursResetTourRequest
    /// </summary>
    [DataContract(Name = "tool_usertours_reset_tour_request")]
    public partial class ToolUsertoursResetTourRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolUsertoursResetTourRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ToolUsertoursResetTourRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolUsertoursResetTourRequest" /> class.
        /// </summary>
        /// <param name="context">Context ID (required).</param>
        /// <param name="pageurl">Current page location (required) (default to &quot;null&quot;).</param>
        /// <param name="tourid">Tour ID (required).</param>
        public ToolUsertoursResetTourRequest(int context = default(int), string pageurl = @"null", int tourid = default(int))
        {
            this.Context = context;
            // to ensure "pageurl" is required (not null)
            if (pageurl == null)
            {
                throw new ArgumentNullException("pageurl is a required property for ToolUsertoursResetTourRequest and cannot be null");
            }
            this.Pageurl = pageurl;
            this.Tourid = tourid;
        }

        /// <summary>
        /// Context ID
        /// </summary>
        /// <value>Context ID</value>
        [DataMember(Name = "context", IsRequired = true, EmitDefaultValue = true)]
        public int Context { get; set; }

        /// <summary>
        /// Current page location
        /// </summary>
        /// <value>Current page location</value>
        [DataMember(Name = "pageurl", IsRequired = true, EmitDefaultValue = true)]
        public string Pageurl { get; set; }

        /// <summary>
        /// Tour ID
        /// </summary>
        /// <value>Tour ID</value>
        [DataMember(Name = "tourid", IsRequired = true, EmitDefaultValue = true)]
        public int Tourid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ToolUsertoursResetTourRequest {\n");
            sb.Append("  Context: ").Append(Context).Append("\n");
            sb.Append("  Pageurl: ").Append(Pageurl).Append("\n");
            sb.Append("  Tourid: ").Append(Tourid).Append("\n");
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
