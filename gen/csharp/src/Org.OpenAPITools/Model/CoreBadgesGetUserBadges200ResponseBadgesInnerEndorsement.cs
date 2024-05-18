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
    /// CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement
    /// </summary>
    [DataContract(Name = "core_badges_get_user_badges_200_response_badges_inner_endorsement")]
    public partial class CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement" /> class.
        /// </summary>
        /// <param name="badgeid">Badge id (required).</param>
        /// <param name="claimcomment">Claim comment (required).</param>
        /// <param name="claimid">Claim URL (required).</param>
        /// <param name="dateissued">Date issued (required) (default to 0).</param>
        /// <param name="id">Endorsement id (required).</param>
        /// <param name="issueremail">Endorsement issuer email (required).</param>
        /// <param name="issuername">Endorsement issuer name (required).</param>
        /// <param name="issuerurl">Endorsement issuer URL (required).</param>
        public CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement(int badgeid = default(int), string claimcomment = default(string), string claimid = default(string), int dateissued = 0, int id = default(int), string issueremail = default(string), string issuername = default(string), string issuerurl = default(string))
        {
            this.Badgeid = badgeid;
            // to ensure "claimcomment" is required (not null)
            if (claimcomment == null)
            {
                throw new ArgumentNullException("claimcomment is a required property for CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement and cannot be null");
            }
            this.Claimcomment = claimcomment;
            // to ensure "claimid" is required (not null)
            if (claimid == null)
            {
                throw new ArgumentNullException("claimid is a required property for CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement and cannot be null");
            }
            this.Claimid = claimid;
            this.Dateissued = dateissued;
            this.Id = id;
            // to ensure "issueremail" is required (not null)
            if (issueremail == null)
            {
                throw new ArgumentNullException("issueremail is a required property for CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement and cannot be null");
            }
            this.Issueremail = issueremail;
            // to ensure "issuername" is required (not null)
            if (issuername == null)
            {
                throw new ArgumentNullException("issuername is a required property for CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement and cannot be null");
            }
            this.Issuername = issuername;
            // to ensure "issuerurl" is required (not null)
            if (issuerurl == null)
            {
                throw new ArgumentNullException("issuerurl is a required property for CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement and cannot be null");
            }
            this.Issuerurl = issuerurl;
        }

        /// <summary>
        /// Badge id
        /// </summary>
        /// <value>Badge id</value>
        [DataMember(Name = "badgeid", IsRequired = true, EmitDefaultValue = true)]
        public int Badgeid { get; set; }

        /// <summary>
        /// Claim comment
        /// </summary>
        /// <value>Claim comment</value>
        [DataMember(Name = "claimcomment", IsRequired = true, EmitDefaultValue = true)]
        public string Claimcomment { get; set; }

        /// <summary>
        /// Claim URL
        /// </summary>
        /// <value>Claim URL</value>
        [DataMember(Name = "claimid", IsRequired = true, EmitDefaultValue = true)]
        public string Claimid { get; set; }

        /// <summary>
        /// Date issued
        /// </summary>
        /// <value>Date issued</value>
        [DataMember(Name = "dateissued", IsRequired = true, EmitDefaultValue = true)]
        public int Dateissued { get; set; }

        /// <summary>
        /// Endorsement id
        /// </summary>
        /// <value>Endorsement id</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public int Id { get; set; }

        /// <summary>
        /// Endorsement issuer email
        /// </summary>
        /// <value>Endorsement issuer email</value>
        [DataMember(Name = "issueremail", IsRequired = true, EmitDefaultValue = true)]
        public string Issueremail { get; set; }

        /// <summary>
        /// Endorsement issuer name
        /// </summary>
        /// <value>Endorsement issuer name</value>
        [DataMember(Name = "issuername", IsRequired = true, EmitDefaultValue = true)]
        public string Issuername { get; set; }

        /// <summary>
        /// Endorsement issuer URL
        /// </summary>
        /// <value>Endorsement issuer URL</value>
        [DataMember(Name = "issuerurl", IsRequired = true, EmitDefaultValue = true)]
        public string Issuerurl { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement {\n");
            sb.Append("  Badgeid: ").Append(Badgeid).Append("\n");
            sb.Append("  Claimcomment: ").Append(Claimcomment).Append("\n");
            sb.Append("  Claimid: ").Append(Claimid).Append("\n");
            sb.Append("  Dateissued: ").Append(Dateissued).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Issueremail: ").Append(Issueremail).Append("\n");
            sb.Append("  Issuername: ").Append(Issuername).Append("\n");
            sb.Append("  Issuerurl: ").Append(Issuerurl).Append("\n");
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