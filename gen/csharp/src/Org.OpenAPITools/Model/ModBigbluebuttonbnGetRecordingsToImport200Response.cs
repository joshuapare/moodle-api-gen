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
    /// ModBigbluebuttonbnGetRecordingsToImport200Response
    /// </summary>
    [DataContract(Name = "mod_bigbluebuttonbn_get_recordings_to_import_200_response")]
    public partial class ModBigbluebuttonbnGetRecordingsToImport200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModBigbluebuttonbnGetRecordingsToImport200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModBigbluebuttonbnGetRecordingsToImport200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModBigbluebuttonbnGetRecordingsToImport200Response" /> class.
        /// </summary>
        /// <param name="status">Whether the fetch was successful (required).</param>
        /// <param name="tabledata">tabledata.</param>
        /// <param name="warnings">warnings.</param>
        public ModBigbluebuttonbnGetRecordingsToImport200Response(bool status = default(bool), ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata tabledata = default(ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata), List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            this.Status = status;
            this.Tabledata = tabledata;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Whether the fetch was successful
        /// </summary>
        /// <value>Whether the fetch was successful</value>
        [DataMember(Name = "status", IsRequired = true, EmitDefaultValue = true)]
        public bool Status { get; set; }

        /// <summary>
        /// Gets or Sets Tabledata
        /// </summary>
        [DataMember(Name = "tabledata", EmitDefaultValue = false)]
        public ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata Tabledata { get; set; }

        /// <summary>
        /// Gets or Sets Warnings
        /// </summary>
        [DataMember(Name = "warnings", EmitDefaultValue = false)]
        public List<AuthEmailSignupUser200ResponseWarningsInner> Warnings { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModBigbluebuttonbnGetRecordingsToImport200Response {\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Tabledata: ").Append(Tabledata).Append("\n");
            sb.Append("  Warnings: ").Append(Warnings).Append("\n");
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