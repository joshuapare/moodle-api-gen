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
    /// ModH5pactivityViewH5pactivityRequest
    /// </summary>
    [DataContract(Name = "mod_h5pactivity_view_h5pactivity_request")]
    public partial class ModH5pactivityViewH5pactivityRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModH5pactivityViewH5pactivityRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModH5pactivityViewH5pactivityRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModH5pactivityViewH5pactivityRequest" /> class.
        /// </summary>
        /// <param name="h5pactivityid">H5P activity instance id (required) (default to null).</param>
        public ModH5pactivityViewH5pactivityRequest(int h5pactivityid = null)
        {
            this.H5pactivityid = h5pactivityid;
        }

        /// <summary>
        /// H5P activity instance id
        /// </summary>
        /// <value>H5P activity instance id</value>
        [DataMember(Name = "h5pactivityid", IsRequired = true, EmitDefaultValue = true)]
        public int H5pactivityid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModH5pactivityViewH5pactivityRequest {\n");
            sb.Append("  H5pactivityid: ").Append(H5pactivityid).Append("\n");
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
