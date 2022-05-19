package app

import (
	"context"
	"fmt"
	"log"
	"os"

	"cloud.google.com/go/storage"
	"golang.org/x/oauth2/google"
	"google.golang.org/api/option"
)

type GCPArgs struct {
	VMName         string // the name of the source VM.
	ProjectID      string // the project ID to which the source VM belongs.
	VMZone         string // the zone where the source VM is located.
	SourceDisk     string // the device name of the disk from which you want to create the image.
	DisKAutoDelete bool

	ImageName   string //  a name for the new image that you want to create.
	SourceImage string // the image from which you want to create the image.
	Location    string // Optional: the storage location of your image.
}

func retrieveCredentials() (string, error) {
	credentialsPath, ok := os.LookupEnv(GCPCredentialEnvVariable)
	if !ok {
		return "", fmt.Errorf(
			"failed to get client secret (GOOGLE_APPLICATION_CREDENTIALS): %w",
			ErrConfigRequired,
		)
	}

	return credentialsPath, nil
}

func getGCPClient(path, projectID string) (*storage.Client, error) {
	ctx := context.Background()

	creds, err := google.FindDefaultCredentials(ctx, storage.ScopeReadOnly)
	if err != nil {
		log.Fatal(err)
	}
	return storage.NewClient(ctx, option.WithCredentials(creds))
}

func ensureGCP() error {

	return nil
}
