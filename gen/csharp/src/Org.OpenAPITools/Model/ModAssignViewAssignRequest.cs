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
    /// ModAssignViewAssignRequest
    /// </summary>
    [DataContract(Name = "mod_assign_view_assign_request")]
    public partial class ModAssignViewAssignRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModAssignViewAssignRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModAssignViewAssignRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModAssignViewAssignRequest" /> class.
        /// </summary>
        /// <param name="assignid">assign instance id (required).</param>
        public ModAssignViewAssignRequest(int assignid = default(int))
        {
            this.Assignid = assignid;
        }

        /// <summary>
        /// assign instance id
        /// </summary>
        /// <value>assign instance id</value>
        [DataMember(Name = "assignid", IsRequired = true, EmitDefaultValue = true)]
        public int Assignid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModAssignViewAssignRequest {\n");
            sb.Append("  Assignid: ").Append(Assignid).Append("\n");
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
